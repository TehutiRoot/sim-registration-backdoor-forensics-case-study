package androidx.media;

import android.os.Bundle;
import androidx.versionedparcelable.VersionedParcelable;

/* loaded from: classes2.dex */
interface AudioAttributesImpl extends VersionedParcelable {
    /* renamed from: a */
    int mo53972a();

    /* renamed from: b */
    Object mo53971b();

    int getContentType();

    int getFlags();

    int getLegacyStreamType();

    int getUsage();

    int getVolumeControlStream();

    Bundle toBundle();
}