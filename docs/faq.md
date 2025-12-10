# Frequently Asked Questions

## Is this just a hypothetical example or a lab exercise?

No.  
This case study is based on a **real production-linked application** and real behaviour observed in the field.  
Only names, endpoints and personal data have been anonymised; the logic and investigative steps are faithful to the original incident.

## Why not disclose the real operator or app name?

The objective is to improve security and awareness, not to create public blame or legal exposure.  
Revealing the operator or exact product would add little technical value but significant legal and safety risk for multiple parties.

## Could these flows be explained by simple bugs?

The evidence suggests otherwise:

- The bypass behaviours are controlled by explicit configuration flags and distinct code paths.  
- They can be enabled or disabled centrally from the backend.  
- They evolved across app versions in a way consistent with maintained features, not accidental bugs.

See `docs/tools-and-evidence.md` for detailed points of proof.

## Are you providing an exploit or attack script?

No.  
This repository documents **how the backdoors were discovered and proven**, not how to exploit live systems.  
All artefacts are sanitised, and no working credentials, domains or production endpoints are included.

## Can this methodology be applied to other KYC / registration apps?

Yes.  
The investigation workflow in `docs/forensic-methodology.md` is intentionally generic:

- acquire and version artefacts,  
- perform static analysis,  
- map configuration to behaviour,  
- test flows in a controlled lab,  
- assess systemic impact.

It can be adapted to other critical apps where server-controlled flags may weaken security.

## How should operators or regulators use this case study?

As a **reference checklist** and a **warning**:

- Audit your own registration and KYC apps for similar patterns (hidden flags, special flows, VIP/test exceptions).  
- Ensure that any special modes are strictly logged, monitored and governed.  
- Treat mobile apps and backend configs as part of regulated critical infrastructure, not just IT tools.
