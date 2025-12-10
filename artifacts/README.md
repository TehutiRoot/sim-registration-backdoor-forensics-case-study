# Sanitised Artifacts

This directory contains selected, **sanitised** artifacts that illustrate how the hidden backdoor logic manifests in configuration, logs and code.

The goal is to show *how* the behaviour was proven without exposing live systems or real subscriber data.

- `configs/` – example configuration payloads from the backend (fields and structure preserved, values anonymised).  
- `logs/` – example registration log entries linking configuration flags to application behaviour.  
- `code/` – pseudocode snippets representing decision logic reconstructed from decompiled sources.

All JSON fields, identifiers and comments are generic and should be treated as patterns, not as live data.
