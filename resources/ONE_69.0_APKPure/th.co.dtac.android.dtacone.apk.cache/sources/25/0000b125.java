package com.google.firebase.p015ml.vision;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzqn;
import com.google.android.gms.internal.firebase_ml.zzrc;
import com.google.firebase.FirebaseApp;
import com.google.firebase.p015ml.common.FirebaseMLException;
import com.google.firebase.p015ml.vision.barcode.FirebaseVisionBarcodeDetector;
import com.google.firebase.p015ml.vision.barcode.FirebaseVisionBarcodeDetectorOptions;
import com.google.firebase.p015ml.vision.cloud.FirebaseVisionCloudDetectorOptions;
import com.google.firebase.p015ml.vision.cloud.landmark.FirebaseVisionCloudLandmarkDetector;
import com.google.firebase.p015ml.vision.document.FirebaseVisionCloudDocumentRecognizerOptions;
import com.google.firebase.p015ml.vision.document.FirebaseVisionDocumentTextRecognizer;
import com.google.firebase.p015ml.vision.face.FirebaseVisionFaceDetector;
import com.google.firebase.p015ml.vision.face.FirebaseVisionFaceDetectorOptions;
import com.google.firebase.p015ml.vision.label.FirebaseVisionCloudImageLabelerOptions;
import com.google.firebase.p015ml.vision.label.FirebaseVisionImageLabeler;
import com.google.firebase.p015ml.vision.label.FirebaseVisionOnDeviceAutoMLImageLabelerOptions;
import com.google.firebase.p015ml.vision.label.FirebaseVisionOnDeviceImageLabelerOptions;
import com.google.firebase.p015ml.vision.objects.FirebaseVisionObjectDetector;
import com.google.firebase.p015ml.vision.objects.FirebaseVisionObjectDetectorOptions;
import com.google.firebase.p015ml.vision.text.FirebaseVisionCloudTextRecognizerOptions;
import com.google.firebase.p015ml.vision.text.FirebaseVisionTextRecognizer;

/* renamed from: com.google.firebase.ml.vision.FirebaseVision */
/* loaded from: classes4.dex */
public class FirebaseVision {

    /* renamed from: c */
    public static final FirebaseVisionCloudDetectorOptions f55828c = new FirebaseVisionCloudDetectorOptions.Builder().build();

    /* renamed from: d */
    public static final FirebaseVisionFaceDetectorOptions f55829d = new FirebaseVisionFaceDetectorOptions.Builder().build();

    /* renamed from: e */
    public static final FirebaseVisionBarcodeDetectorOptions f55830e = new FirebaseVisionBarcodeDetectorOptions.Builder().build();

    /* renamed from: f */
    public static final FirebaseVisionCloudTextRecognizerOptions f55831f = new FirebaseVisionCloudTextRecognizerOptions.Builder().build();

    /* renamed from: g */
    public static final FirebaseVisionCloudDocumentRecognizerOptions f55832g = new FirebaseVisionCloudDocumentRecognizerOptions.Builder().build();

    /* renamed from: h */
    public static final FirebaseVisionOnDeviceImageLabelerOptions f55833h = new FirebaseVisionOnDeviceImageLabelerOptions.Builder().build();

    /* renamed from: i */
    public static final FirebaseVisionCloudImageLabelerOptions f55834i = new FirebaseVisionCloudImageLabelerOptions.Builder().build();

    /* renamed from: j */
    public static final FirebaseVisionObjectDetectorOptions f55835j = new FirebaseVisionObjectDetectorOptions.Builder().build();

    /* renamed from: a */
    public final zzqn f55836a;

    /* renamed from: b */
    public final zzrc f55837b;

    public FirebaseVision(zzqn zzqnVar) {
        this.f55836a = zzqnVar;
        this.f55837b = zzrc.zzb(zzqnVar);
    }

    @NonNull
    public static FirebaseVision getInstance() {
        return getInstance(FirebaseApp.getInstance());
    }

    @NonNull
    public FirebaseVisionDocumentTextRecognizer getCloudDocumentTextRecognizer(@NonNull FirebaseVisionCloudDocumentRecognizerOptions firebaseVisionCloudDocumentRecognizerOptions) {
        return FirebaseVisionDocumentTextRecognizer.zza(this.f55836a, firebaseVisionCloudDocumentRecognizerOptions);
    }

    @NonNull
    public FirebaseVisionImageLabeler getCloudImageLabeler(@NonNull FirebaseVisionCloudImageLabelerOptions firebaseVisionCloudImageLabelerOptions) {
        return FirebaseVisionImageLabeler.zza(this.f55836a, firebaseVisionCloudImageLabelerOptions);
    }

    @NonNull
    public FirebaseVisionTextRecognizer getCloudTextRecognizer() {
        return FirebaseVisionTextRecognizer.zza(this.f55836a, f55831f, false);
    }

    @NonNull
    @Deprecated
    public FirebaseVisionImageLabeler getOnDeviceAutoMLImageLabeler(@NonNull FirebaseVisionOnDeviceAutoMLImageLabelerOptions firebaseVisionOnDeviceAutoMLImageLabelerOptions) throws FirebaseMLException {
        return FirebaseVisionImageLabeler.zza(this.f55836a, (FirebaseVisionOnDeviceAutoMLImageLabelerOptions) Preconditions.checkNotNull(firebaseVisionOnDeviceAutoMLImageLabelerOptions, "Please provide a valid FirebaseVisionOnDeviceAutoMLImageLabelerOptions"));
    }

    @NonNull
    @Deprecated
    public FirebaseVisionImageLabeler getOnDeviceImageLabeler(@NonNull FirebaseVisionOnDeviceImageLabelerOptions firebaseVisionOnDeviceImageLabelerOptions) {
        return FirebaseVisionImageLabeler.zza(this.f55836a, (FirebaseVisionOnDeviceImageLabelerOptions) Preconditions.checkNotNull(firebaseVisionOnDeviceImageLabelerOptions, "Please provide a valid FirebaseVisionOnDeviceImageLabelerOptions"));
    }

    @NonNull
    @Deprecated
    public FirebaseVisionObjectDetector getOnDeviceObjectDetector(@NonNull FirebaseVisionObjectDetectorOptions firebaseVisionObjectDetectorOptions) {
        return FirebaseVisionObjectDetector.zza(this.f55836a, firebaseVisionObjectDetectorOptions);
    }

    @NonNull
    @Deprecated
    public FirebaseVisionTextRecognizer getOnDeviceTextRecognizer() {
        return FirebaseVisionTextRecognizer.zza(this.f55836a, null, true);
    }

    @NonNull
    @Deprecated
    public FirebaseVisionBarcodeDetector getVisionBarcodeDetector(@NonNull FirebaseVisionBarcodeDetectorOptions firebaseVisionBarcodeDetectorOptions) {
        return FirebaseVisionBarcodeDetector.zza(this.f55836a, (FirebaseVisionBarcodeDetectorOptions) Preconditions.checkNotNull(firebaseVisionBarcodeDetectorOptions, "Please provide a valid FirebaseVisionBarcodeDetectorOptions"));
    }

    @NonNull
    public FirebaseVisionCloudLandmarkDetector getVisionCloudLandmarkDetector(@NonNull FirebaseVisionCloudDetectorOptions firebaseVisionCloudDetectorOptions) {
        return FirebaseVisionCloudLandmarkDetector.zza(this.f55836a, firebaseVisionCloudDetectorOptions);
    }

    @NonNull
    @Deprecated
    public FirebaseVisionFaceDetector getVisionFaceDetector(@NonNull FirebaseVisionFaceDetectorOptions firebaseVisionFaceDetectorOptions) {
        Preconditions.checkNotNull(firebaseVisionFaceDetectorOptions, "Please provide a valid FirebaseVisionFaceDetectorOptions");
        return FirebaseVisionFaceDetector.zza(this.f55836a, firebaseVisionFaceDetectorOptions);
    }

    public boolean isStatsCollectionEnabled() {
        return this.f55837b.zzpa();
    }

    public void setStatsCollectionEnabled(boolean z) {
        this.f55837b.zzar(z);
    }

    @NonNull
    public static FirebaseVision getInstance(@NonNull FirebaseApp firebaseApp) {
        Preconditions.checkNotNull(firebaseApp, "MlKitContext can not be null");
        return (FirebaseVision) firebaseApp.get(FirebaseVision.class);
    }

    @NonNull
    public FirebaseVisionDocumentTextRecognizer getCloudDocumentTextRecognizer() {
        return FirebaseVisionDocumentTextRecognizer.zza(this.f55836a, f55832g);
    }

    @NonNull
    public FirebaseVisionImageLabeler getCloudImageLabeler() {
        return FirebaseVisionImageLabeler.zza(this.f55836a, f55834i);
    }

    @NonNull
    public FirebaseVisionTextRecognizer getCloudTextRecognizer(@NonNull FirebaseVisionCloudTextRecognizerOptions firebaseVisionCloudTextRecognizerOptions) {
        return FirebaseVisionTextRecognizer.zza(this.f55836a, firebaseVisionCloudTextRecognizerOptions, false);
    }

    @NonNull
    @Deprecated
    public FirebaseVisionObjectDetector getOnDeviceObjectDetector() {
        return FirebaseVisionObjectDetector.zza(this.f55836a, f55835j);
    }

    @NonNull
    public FirebaseVisionCloudLandmarkDetector getVisionCloudLandmarkDetector() {
        return FirebaseVisionCloudLandmarkDetector.zza(this.f55836a, f55828c);
    }

    @NonNull
    @Deprecated
    public FirebaseVisionFaceDetector getVisionFaceDetector() {
        return FirebaseVisionFaceDetector.zza(this.f55836a, f55829d);
    }

    @NonNull
    @Deprecated
    public FirebaseVisionImageLabeler getOnDeviceImageLabeler() {
        return FirebaseVisionImageLabeler.zza(this.f55836a, f55833h);
    }

    @NonNull
    @Deprecated
    public FirebaseVisionBarcodeDetector getVisionBarcodeDetector() {
        return FirebaseVisionBarcodeDetector.zza(this.f55836a, f55830e);
    }
}