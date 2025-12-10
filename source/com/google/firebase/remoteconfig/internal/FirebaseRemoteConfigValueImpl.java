package com.google.firebase.remoteconfig.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;

/* loaded from: classes4.dex */
public class FirebaseRemoteConfigValueImpl implements FirebaseRemoteConfigValue {

    /* renamed from: a */
    public final String f56457a;

    /* renamed from: b */
    public final int f56458b;

    public FirebaseRemoteConfigValueImpl(String str, int i) {
        this.f56457a = str;
        this.f56458b = i;
    }

    /* renamed from: a */
    public final String m37658a() {
        return asString().trim();
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigValue
    public boolean asBoolean() throws IllegalArgumentException {
        if (this.f56458b == 0) {
            return false;
        }
        String m37658a = m37658a();
        if (ConfigGetParameterHandler.f56400e.matcher(m37658a).matches()) {
            return true;
        }
        if (ConfigGetParameterHandler.f56401f.matcher(m37658a).matches()) {
            return false;
        }
        throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", m37658a, TypedValues.Custom.S_BOOLEAN));
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigValue
    public byte[] asByteArray() {
        if (this.f56458b == 0) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_BYTE_ARRAY;
        }
        return this.f56457a.getBytes(ConfigGetParameterHandler.FRC_BYTE_ARRAY_ENCODING);
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigValue
    public double asDouble() {
        if (this.f56458b == 0) {
            return 0.0d;
        }
        String m37658a = m37658a();
        try {
            return Double.valueOf(m37658a).doubleValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", m37658a, "double"), e);
        }
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigValue
    public long asLong() {
        if (this.f56458b == 0) {
            return 0L;
        }
        String m37658a = m37658a();
        try {
            return Long.valueOf(m37658a).longValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", m37658a, "long"), e);
        }
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigValue
    public String asString() {
        if (this.f56458b == 0) {
            return "";
        }
        m37657b();
        return this.f56457a;
    }

    /* renamed from: b */
    public final void m37657b() {
        if (this.f56457a != null) {
            return;
        }
        throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigValue
    public int getSource() {
        return this.f56458b;
    }
}
