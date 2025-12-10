package com.google.firebase.p015ml.vision.objects.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* renamed from: com.google.firebase.ml.vision.objects.internal.zzc */
/* loaded from: classes4.dex */
public interface zzc extends IInterface {
    IObjectDetector newObjectDetector(IObjectWrapper iObjectWrapper, ObjectDetectorOptionsParcel objectDetectorOptionsParcel) throws RemoteException;
}
