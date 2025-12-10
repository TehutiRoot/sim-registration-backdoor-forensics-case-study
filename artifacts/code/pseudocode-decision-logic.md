# Pseudocode – Simplified Decision Logic

The following pseudocode represents a simplified reconstruction of how the app chooses different registration flows based on server configuration.

config = fetchServerConfig(requestContext)

switch config.flowType:

case "RTR_LAUNDERING":
if config.subscriberStatus == "PRE_REGISTERED":
requiredImages = ["ID_FRONT"]
optionalImages = ["FACE", "ID_BACK"]
runRtrUpdate(requiredImages, optionalImages)
else:
runFullKyc()

case "MRTR_MASS_PRODUCTION":
if config.isNumberingPooling == true:
maxBatch = config.maxBatchSize or 100
requiredImagesPerBatch = ["ID_FRONT"]
optionalImagesPerBatch = ["FACE"]
runMultiSimRegistration(maxBatch, requiredImagesPerBatch, optionalImagesPerBatch)
else:
runFullKyc()

case "NORMAL_REGISTRATION":
if config.flags.byPass == true:
// VIP or test profile
skipBiometric()
markRegistrationSuccess(reason="SERVER_BYPASS")
else:
runFullKyc()

default:
runFullKyc()

text

This logic shows how a single app binary can behave securely or insecurely depending entirely on server-controlled flags and configuration.

