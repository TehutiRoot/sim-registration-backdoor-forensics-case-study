package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import ch.qos.logback.classic.net.SyslogAppender;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@KeepForSdk
@SafeParcelable.Class(creator = "WakeLockEventCreator")
@Deprecated
/* loaded from: classes3.dex */
public final class WakeLockEvent extends StatsEvent {
    @NonNull
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new zza();

    /* renamed from: a */
    public final int f45283a;

    /* renamed from: b */
    public final long f45284b;

    /* renamed from: c */
    public final int f45285c;

    /* renamed from: d */
    public final String f45286d;

    /* renamed from: e */
    public final String f45287e;

    /* renamed from: f */
    public final String f45288f;

    /* renamed from: g */
    public final int f45289g;

    /* renamed from: h */
    public final List f45290h;

    /* renamed from: i */
    public final String f45291i;

    /* renamed from: j */
    public final long f45292j;

    /* renamed from: k */
    public final int f45293k;

    /* renamed from: l */
    public final String f45294l;

    /* renamed from: m */
    public final float f45295m;

    /* renamed from: n */
    public final long f45296n;

    /* renamed from: o */
    public final boolean f45297o;

    public WakeLockEvent(int i, long j, int i2, String str, int i3, List list, String str2, long j2, int i4, String str3, String str4, float f, long j3, String str5, boolean z) {
        this.f45283a = i;
        this.f45284b = j;
        this.f45285c = i2;
        this.f45286d = str;
        this.f45287e = str3;
        this.f45288f = str5;
        this.f45289g = i3;
        this.f45290h = list;
        this.f45291i = str2;
        this.f45292j = j2;
        this.f45293k = i4;
        this.f45294l = str4;
        this.f45295m = f;
        this.f45296n = j3;
        this.f45297o = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f45283a);
        SafeParcelWriter.writeLong(parcel, 2, this.f45284b);
        SafeParcelWriter.writeString(parcel, 4, this.f45286d, false);
        SafeParcelWriter.writeInt(parcel, 5, this.f45289g);
        SafeParcelWriter.writeStringList(parcel, 6, this.f45290h, false);
        SafeParcelWriter.writeLong(parcel, 8, this.f45292j);
        SafeParcelWriter.writeString(parcel, 10, this.f45287e, false);
        SafeParcelWriter.writeInt(parcel, 11, this.f45285c);
        SafeParcelWriter.writeString(parcel, 12, this.f45291i, false);
        SafeParcelWriter.writeString(parcel, 13, this.f45294l, false);
        SafeParcelWriter.writeInt(parcel, 14, this.f45293k);
        SafeParcelWriter.writeFloat(parcel, 15, this.f45295m);
        SafeParcelWriter.writeLong(parcel, 16, this.f45296n);
        SafeParcelWriter.writeString(parcel, 17, this.f45288f, false);
        SafeParcelWriter.writeBoolean(parcel, 18, this.f45297o);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final int zza() {
        return this.f45285c;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long zzb() {
        return this.f45284b;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    @NonNull
    public final String zzc() {
        String join;
        List list = this.f45290h;
        String str = "";
        if (list == null) {
            join = "";
        } else {
            join = TextUtils.join(",", list);
        }
        int i = this.f45293k;
        String str2 = this.f45287e;
        String str3 = this.f45294l;
        float f = this.f45295m;
        String str4 = this.f45288f;
        int i2 = this.f45289g;
        String str5 = this.f45286d;
        boolean z = this.f45297o;
        StringBuilder sb = new StringBuilder();
        sb.append(SyslogAppender.DEFAULT_STACKTRACE_PATTERN);
        sb.append(str5);
        sb.append(SyslogAppender.DEFAULT_STACKTRACE_PATTERN);
        sb.append(i2);
        sb.append(SyslogAppender.DEFAULT_STACKTRACE_PATTERN);
        sb.append(join);
        sb.append(SyslogAppender.DEFAULT_STACKTRACE_PATTERN);
        sb.append(i);
        sb.append(SyslogAppender.DEFAULT_STACKTRACE_PATTERN);
        if (str2 == null) {
            str2 = "";
        }
        sb.append(str2);
        sb.append(SyslogAppender.DEFAULT_STACKTRACE_PATTERN);
        if (str3 == null) {
            str3 = "";
        }
        sb.append(str3);
        sb.append(SyslogAppender.DEFAULT_STACKTRACE_PATTERN);
        sb.append(f);
        sb.append(SyslogAppender.DEFAULT_STACKTRACE_PATTERN);
        if (str4 != null) {
            str = str4;
        }
        sb.append(str);
        sb.append(SyslogAppender.DEFAULT_STACKTRACE_PATTERN);
        sb.append(z);
        return sb.toString();
    }
}
