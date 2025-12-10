package com.google.zxing.client.result;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes5.dex */
public final class GeoParsedResult extends ParsedResult {

    /* renamed from: b */
    public final double f57685b;

    /* renamed from: c */
    public final double f57686c;

    /* renamed from: d */
    public final double f57687d;

    /* renamed from: e */
    public final String f57688e;

    public GeoParsedResult(double d, double d2, double d3, String str) {
        super(ParsedResultType.GEO);
        this.f57685b = d;
        this.f57686c = d2;
        this.f57687d = d3;
        this.f57688e = str;
    }

    public double getAltitude() {
        return this.f57687d;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder sb = new StringBuilder(20);
        sb.append(this.f57685b);
        sb.append(", ");
        sb.append(this.f57686c);
        if (this.f57687d > 0.0d) {
            sb.append(", ");
            sb.append(this.f57687d);
            sb.append('m');
        }
        if (this.f57688e != null) {
            sb.append(" (");
            sb.append(this.f57688e);
            sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        return sb.toString();
    }

    public String getGeoURI() {
        StringBuilder sb = new StringBuilder();
        sb.append("geo:");
        sb.append(this.f57685b);
        sb.append(',');
        sb.append(this.f57686c);
        if (this.f57687d > 0.0d) {
            sb.append(',');
            sb.append(this.f57687d);
        }
        if (this.f57688e != null) {
            sb.append('?');
            sb.append(this.f57688e);
        }
        return sb.toString();
    }

    public double getLatitude() {
        return this.f57685b;
    }

    public double getLongitude() {
        return this.f57686c;
    }

    public String getQuery() {
        return this.f57688e;
    }
}
