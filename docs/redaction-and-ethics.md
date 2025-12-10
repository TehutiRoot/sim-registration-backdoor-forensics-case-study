# Redaction & Ethics

This case study is based on a **real application and real behaviour** observed in production-linked environments.  
To make the findings shareable without exposing individuals or operators to unnecessary risk, all material in this repository follows strict redaction and ethical rules.

## 1. What Has Been Redacted

The following elements from the original case are *never* published here:

- Commercial identifiers:
  - Real app name, package name, branding assets and logos.
  - Real company / operator names.
- Infrastructure details:
  - Real domains, IP addresses, API paths and authentication endpoints.
  - Internal server names, database identifiers and system IDs.
- Personal and subscriber data:
  - Real phone numbers, ICCIDs, IMSIs and identity document numbers.
  - Any data that could be linked back to individual customers, dealers or staff.

All such values are replaced with neutral placeholders, for example:

- `com.example.kycapp` instead of the real Android package name.  
- `kyc-api.example.com` instead of real API endpoints.  
- `+66XXXXXXXXX`, `ID-XXXXXX`, `SIMPOOL-XXXX` for subscriber-related identifiers.

## 2. What Remains Faithful to the Original Case

The following aspects are kept as close as possible to the real incident:

- The overall architecture of the SIM registration ecosystem.  
- The structure and semantics of configuration objects (e.g. flags equivalent to `byPass`, `optionalImages`, `isNumberingPooling`).  
- The control logic of the hidden flows (RTR laundering, MRTR mass production, VIP bypass, fake-fail fallback).  
- The investigation methodology and the types of artefacts collected (APKs, configs, logs, flows).

In other words: names and values are anonymised, but **logic, patterns and methodology** are preserved.

## 3. Intended Use

This repository is intended for:

- Digital forensics practitioners and incident responders.  
- Security engineers and architects responsible for KYC / SIM registration systems.  
- Auditors and regulators who need concrete technical examples of systemic weaknesses.

It is **not** intended for:

- Building or operating fraudulent SIM registration systems.  
- Repeating the original attack in production environments.  
- Identifying or naming specific operators or individuals.

## 4. Legal and Ethical Boundaries

- All analysis and reproduction here rely on artefacts obtained and processed within the bounds of applicable law and professional conduct.  
- No credentials, live endpoints or tools necessary to attack current systems are provided.  
- Readers are responsible for ensuring that any use of the techniques described here complies with local law, contractual obligations and ethical standards.

If you work for an operator or regulator and believe similar issues may exist in your environment, treat this repository as a **warning and a blueprint for defensive investigation**, not as a how‑to guide for exploitation.
