
# EliminationAlliance

## Properties

| Name         | Type                                                          | Description                                                       | Notes      |
| ------------ | ------------------------------------------------------------- | ----------------------------------------------------------------- | ---------- |
| **name**     | **kotlin.String**                                             | Alliance name, may be null.                                       | [optional] |
| **backup**   | [**EliminationAllianceBackup**](EliminationAllianceBackup.md) |                                                                   | [optional] |
| **declines** | **kotlin.Array&lt;kotlin.String&gt;**                         | List of teams that declined the alliance.                         | [optional] |
| **picks**    | **kotlin.Array&lt;kotlin.String&gt;**                         | List of team keys picked for the alliance. First pick is captain. |
| **status**   | [**EliminationAllianceStatus**](EliminationAllianceStatus.md) |                                                                   | [optional] |
