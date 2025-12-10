package com.google.firebase.remoteconfig.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;

/* loaded from: classes4.dex */
public class FirebaseRemoteConfigValueImpl implements FirebaseRemoteConfigValue {

    /* renamed from: a */
    public final String f56469a;

    /* renamed from: b */
    public final int f56470b;

    public FirebaseRemoteConfigValueImpl(String str, int i) {
        this.f56469a = str;
        this.f56470b = i;
    }

    /* renamed from: a */
    public final String m37650a() {
        return asString().trim();
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigValue
    public boolean asBoolean() throws IllegalArgumentException {
        if (this.f56470b == 0) {
            return false;
        }
        String m37650a = m37650a();
        if (ConfigGetParameterHandler.f56412e.matcher(m37650a).matches()) {
            return true;
        }
        if (ConfigGetParameterHandler.f56413f.matcher(m37650a).matches()) {
            return false;
        }
        throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", m37650a, TypedValues.Custom.S_BOOLEAN));
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigValue
    public byte[] asByteArray() {
        if (this.f56470b == 0) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_BYTE_ARRAY;
        }
        return this.f56469a.getBytes(ConfigGetParameterHandler.FRC_BYTE_ARRAY_ENCODING);
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigValue
    public double asDouble() {
        if (this.f56470b == 0) {
            return 0.0d;
        }
        String m37650a = m37650a();
        try {
            return Double.valueOf(m37650a).doubleValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", m37650a, "double"), e);
        }
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigValue
    public long asLong() {
        if (this.f56470b == 0) {
            return 0L;
        }
        String m37650a = m37650a();
        try {
            return Long.valueOf(m37650a).longValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", m37650a, "long"), e);
        }
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigValue
    public String asString() {
        if (this.f56470b == 0) {
            return "";
        }
        m37649b();
        return this.f56469a;
    }

    /* renamed from: b */
    public final void m37649b() {
        if (this.f56469a != null) {
            return;
        }
        throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigValue
    public int getSource() {
        return this.f56470b;
    }
}