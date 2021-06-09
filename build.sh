# Download Spec
# curl 'https://www.thebluealliance.com/swagger/api_v3.json' -o spec.json

# Generate project
docker run --rm \
    -v $PWD:/local \
    -u $UID:$UID \
    openapitools/openapi-generator-cli generate \
        --input-spec '/local/spec.json' \
        --generator-name 'kotlin' \
        --output '/local/'  \
        --package-name 'com.thebluealliance' \
        --group-id 'com.thebluealliance' \
        --artifact-id 'api' \

# Add github pages jekyll config to docs
cp jekyll.yml docs/_config.yml

# Create docs homepage
cp README.md docs/index.md
