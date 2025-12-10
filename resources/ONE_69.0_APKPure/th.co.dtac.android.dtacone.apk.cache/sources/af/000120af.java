package th.p047co.dtac.android.dtacone.model.take_photo;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/take_photo/CameraMode;", "", "()V", "Card", "Face", "IdentidyCard", "None", "Lth/co/dtac/android/dtacone/model/take_photo/CameraMode$Card;", "Lth/co/dtac/android/dtacone/model/take_photo/CameraMode$Face;", "Lth/co/dtac/android/dtacone/model/take_photo/CameraMode$IdentidyCard;", "Lth/co/dtac/android/dtacone/model/take_photo/CameraMode$None;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.take_photo.CameraMode */
/* loaded from: classes8.dex */
public abstract class CameraMode {
    public static final int $stable = 0;

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/take_photo/CameraMode$Card;", "Lth/co/dtac/android/dtacone/model/take_photo/CameraMode;", "()V", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.take_photo.CameraMode$Card */
    /* loaded from: classes8.dex */
    public static final class Card extends CameraMode {
        public static final int $stable = 0;
        @NotNull
        public static final Card INSTANCE = new Card();

        private Card() {
            super(null);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/take_photo/CameraMode$Face;", "Lth/co/dtac/android/dtacone/model/take_photo/CameraMode;", "()V", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.take_photo.CameraMode$Face */
    /* loaded from: classes8.dex */
    public static final class Face extends CameraMode {
        public static final int $stable = 0;
        @NotNull
        public static final Face INSTANCE = new Face();

        private Face() {
            super(null);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/take_photo/CameraMode$IdentidyCard;", "Lth/co/dtac/android/dtacone/model/take_photo/CameraMode;", "()V", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.take_photo.CameraMode$IdentidyCard */
    /* loaded from: classes8.dex */
    public static final class IdentidyCard extends CameraMode {
        public static final int $stable = 0;
        @NotNull
        public static final IdentidyCard INSTANCE = new IdentidyCard();

        private IdentidyCard() {
            super(null);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/take_photo/CameraMode$None;", "Lth/co/dtac/android/dtacone/model/take_photo/CameraMode;", "()V", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.take_photo.CameraMode$None */
    /* loaded from: classes8.dex */
    public static final class None extends CameraMode {
        public static final int $stable = 0;
        @NotNull
        public static final None INSTANCE = new None();

        private None() {
            super(null);
        }
    }

    public /* synthetic */ CameraMode(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CameraMode() {
    }
}