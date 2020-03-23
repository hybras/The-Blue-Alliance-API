# Client library for The Blue Alliance API v3

This project is largely autogenerated using The Blue Alliance's [API Spec](https://www.thebluealliance.com/swagger/api_v3.json). Basic markdown docs are availible in [docs](docs) and are deployed to a [wiki](https://hybras.github.io/The-Blue-Alliance-API/). Fancy html docs from thebluealliance.com [here](https://www.thebluealliance.com/apidocs/v3). The html version lets you try the api out and has a nice ui.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

## Documentation for Authorization

### apiKey

* **Type**: API key
* **API key parameter name**: X-TBA-Auth-Key
* **Location**: HTTP header

NOTE: The api key is injected by rewriting the RequestConfig class (see [build.gradle](https://github.com/hybras/The-Blue-Alliance-API/blob/97abaed7255b47a6fde2d7e1e0200d818a07b857/build.gradle#L48-L79)). In order to change the api key, edit it in gradle.properties.

## Workflow

1. Add changes to `generateSwaggerCodeTba` task in build.gradle
2. Add unit tests (src/test/kotlin)
3. Run `./gradlew build` to generate the code (output to build/swagger-code-tba)
4. Documentation
   1. Copy docs over from generated folder to project root.
   2. Run the FixDocs scripts to remove underscores from names
   3. Fix capitalization in file names
   4. Copy generated docs links in generated README to docs/index.md
   5. Remove "docs" in relative links in index.md
   6. In generated docs, replace repeated h1's with h2's. (Changes `#` to `##`)
   7. Remove extraneous anchor tags (all `<a></a>`)
   8. Create a symbolic link docs/index.md -> docs/README.md. People viewing the source on github will then see the folder's README
   9. Format using vscode plugins (markdownallinone and markdownlint)
