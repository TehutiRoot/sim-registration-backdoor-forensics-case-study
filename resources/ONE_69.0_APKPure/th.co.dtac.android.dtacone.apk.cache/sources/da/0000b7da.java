package com.google.zxing.client.result;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes5.dex */
public final class GeoParsedResult extends ParsedResult {

    /* renamed from: b */
    public final double f57697b;

    /* renamed from: c */
    public final double f57698c;

    /* renamed from: d */
    public final double f57699d;

    /* renamed from: e */
    public final String f57700e;

    public GeoParsedResult(double d, double d2, double d3, String str) {
        super(ParsedResultType.GEO);
        this.f57697b = d;
        this.f57698c = d2;
        this.f57699d = d3;
        this.f57700e = str;
    }

    public double getAltitude() {
        return this.f57699d;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder sb = new StringBuilder(20);
        sb.append(this.f57697b);
        sb.append(", ");
        sb.append(this.f57698c);
        if (this.f57699d > 0.0d) {
            sb.append(", ");
            sb.append(this.f57699d);
            sb.append('m');
        }
        if (this.f57700e != null) {
            sb.append(" (");
            sb.append(this.f57700e);
            sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        return sb.toString();
    }

    public String getGeoURI() {
        StringBuilder sb = new StringBuilder();
        sb.append("geo:");
        sb.append(this.f57697b);
        sb.append(',');
        sb.append(this.f57698c);
        if (this.f57699d > 0.0d) {
            sb.append(',');
            sb.append(this.f57699d);
        }
        if (this.f57700e != null) {
            sb.append('?');
            sb.append(this.f57700e);
        }
        return sb.toString();
    }

    public double getLatitude() {
        return this.f57697b;
    }

    public double getLongitude() {
        return this.f57698c;
    }

    public String getQuery() {
        return this.f57700e;
    }
}