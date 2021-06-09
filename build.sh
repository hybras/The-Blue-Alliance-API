#!/usr/bin/env sh

# Download Spec
curl 'https://www.thebluealliance.com/swagger/api_v3.json' -o spec.json

# Generate project
docker run --rm \
    -v $(pwd):/local \
    -u $UID:$UID \
    openapitools/openapi-generator-cli generate \
        --input-spec '/local/spec.json' \
        --generator-name 'kotlin' \
        --output '/local/'  \
        --minimal-update \
        --package-name 'com.thebluealliance' \
        --group-id 'com.thebluealliance' \
        --artifact-id 'api' \

rm spec.json

# Add github pages jekyll config to docs
cp jekyll.yml docs/_config.yml

# Create docs homepage
cp README.md docs/index.md
