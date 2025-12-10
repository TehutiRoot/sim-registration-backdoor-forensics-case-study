# SIM Registration Backdoor Forensics – Real-World Case Study

## Overview

This repository presents a **real-world forensic case study** of a dealer-facing SIM registration application that was deployed in production and used for KYC (Know Your Customer) identity verification.  
Through systematic analysis of the APKs, configurations and network behaviour, hidden **server-controlled backdoors** were identified that could bypass biometric and identity checks under specific conditions.

All sensitive details (brands, domains, phone numbers, personal data) are **redacted or replaced with neutral placeholders**, but the technical patterns and investigative process are taken directly from the original case.

## Why This Case Matters

- SIM registration and KYC systems are critical infrastructure for national security and anti-fraud controls.  
- Hidden backdoors in such systems enable large-scale identity abuse, “ghost” SIM pools and anonymous communication.  
- This case demonstrates that these weaknesses can exist not only as coding mistakes, but as **intentional server-driven logic** that is invisible to normal users and regulators.

## What This Repository Provides

- A documented **case study**, not a synthetic lab:  
  - Based on real APKs, configs and dealer workflows that were analysed in depth.  
  - Sanitised only where necessary to protect identities and avoid legal exposure.

- A complete forensic trail showing:
  - What artefacts were collected (APK versions, config bundles, logs, flow diagrams).  
  - Which tools and techniques were used to analyse them.  
  - Where exactly the evidence proves that KYC checks can be bypassed.

- Reusable methodology for:
  - Application forensics on high-risk KYC / SIM registration apps.  
  - Detecting server-controlled backdoors and special “VIP” or bulk-registration flows.  

---

## Repository Structure

- `docs/case-study-overview.md` – narrative of the real case, key flows and impact.  
- `docs/forensic-methodology.md` – step-by-step investigation workflow and tools.  
- `docs/hidden-logic-patterns.md` – conceptual description of the discovered backdoor logic.  
- `docs/tools-and-evidence.md` – tools used, points of proof, and responses to common objections.  
- `docs/redaction-and-ethics.md` – what was changed, what remains original, and why.  
- `flows/` – diagrams for each backdoor flow (face-scan fake-fail, VIP bypass, RTR laundering, mass production).  
- `artifacts/` – sanitised samples of configs, logs and decompiled snippets used in the analysis.

---

## How to Read This Case Study

1. Start with `docs/case-study-overview.md` to understand the real-world context and why the backdoors matter.  
2. Continue with `docs/forensic-methodology.md` to see exactly how the application was investigated.  
3. Review `docs/hidden-logic-patterns.md` and the `flows/` diagrams to visualise the hidden paths.  
4. Consult `docs/tools-and-evidence.md` to understand which artefacts prove each claim.

This repository is intended as a reference for digital forensics practitioners, security engineers, and regulators who need concrete, technical evidence of how SIM registration systems can be subverted from the inside.

For detailed narrative and methodology, start with  
`docs/case-study-overview.md` and `docs/forensic-methodology.md`.

