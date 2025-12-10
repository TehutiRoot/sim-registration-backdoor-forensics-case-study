package th.p047co.dtac.android.dtacone.view.appOne.eSign.model;

import androidx.compose.p003ui.graphics.ImageBitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import com.chuckerteam.chucker.internal.support.ResponseProcessor;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b(\b\u0087\b\u0018\u0000 22\u00020\u0001:\u00012BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019JP\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0012J\u0010\u0010\u001d\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b)\u0010\u0012R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0015R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b\n\u0010\u0017R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u0019¨\u00063"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/eSign/model/ImageDocument;", "", "Lth/co/dtac/android/dtacone/view/appOne/eSign/model/ImageDocumentType;", "imageDocumentType", "", "name", "imageName", "Landroidx/compose/ui/graphics/ImageBitmap;", ResponseProcessor.CONTENT_TYPE_IMAGE, "", "isRequired", "", "seq", "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/eSign/model/ImageDocumentType;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/ImageBitmap;ZLjava/lang/Integer;)V", "component1", "()Lth/co/dtac/android/dtacone/view/appOne/eSign/model/ImageDocumentType;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Landroidx/compose/ui/graphics/ImageBitmap;", "component5", "()Z", "component6", "()Ljava/lang/Integer;", "copy", "(Lth/co/dtac/android/dtacone/view/appOne/eSign/model/ImageDocumentType;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/ImageBitmap;ZLjava/lang/Integer;)Lth/co/dtac/android/dtacone/view/appOne/eSign/model/ImageDocument;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/view/appOne/eSign/model/ImageDocumentType;", "getImageDocumentType", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/String;", "getName", OperatorName.CURVE_TO, "getImageName", "d", "Landroidx/compose/ui/graphics/ImageBitmap;", "getImage", "e", "Z", OperatorName.FILL_NON_ZERO, "Ljava/lang/Integer;", "getSeq", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.model.ImageDocument */
/* loaded from: classes10.dex */
public final class ImageDocument {

    /* renamed from: a */
    public final ImageDocumentType f90775a;

    /* renamed from: b */
    public final String f90776b;

    /* renamed from: c */
    public final String f90777c;

    /* renamed from: d */
    public final ImageBitmap f90778d;

    /* renamed from: e */
    public final boolean f90779e;

    /* renamed from: f */
    public final Integer f90780f;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0006"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/eSign/model/ImageDocument$Companion;", "", "()V", "getDefaultImageOption", "", "Lth/co/dtac/android/dtacone/view/appOne/eSign/model/ImageDocument;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.model.ImageDocument$Companion */
    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<ImageDocument> getDefaultImageOption() {
            ArrayList arrayList = new ArrayList(5);
            int i = 0;
            while (i < 5) {
                i++;
                arrayList.add(new ImageDocument(ImageDocumentType.DOCUMENT, "A" + i, "document_" + i + BitmapUtil.IMAGE_JPG_EXTENSION, null, false, Integer.valueOf(i), 8, null));
            }
            return arrayList;
        }

        public Companion() {
        }
    }

    public ImageDocument(@NotNull ImageDocumentType imageDocumentType, @NotNull String name, @NotNull String imageName, @Nullable ImageBitmap imageBitmap, boolean z, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(imageDocumentType, "imageDocumentType");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(imageName, "imageName");
        this.f90775a = imageDocumentType;
        this.f90776b = name;
        this.f90777c = imageName;
        this.f90778d = imageBitmap;
        this.f90779e = z;
        this.f90780f = num;
    }

    public static /* synthetic */ ImageDocument copy$default(ImageDocument imageDocument, ImageDocumentType imageDocumentType, String str, String str2, ImageBitmap imageBitmap, boolean z, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            imageDocumentType = imageDocument.f90775a;
        }
        if ((i & 2) != 0) {
            str = imageDocument.f90776b;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = imageDocument.f90777c;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            imageBitmap = imageDocument.f90778d;
        }
        ImageBitmap imageBitmap2 = imageBitmap;
        if ((i & 16) != 0) {
            z = imageDocument.f90779e;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            num = imageDocument.f90780f;
        }
        return imageDocument.copy(imageDocumentType, str3, str4, imageBitmap2, z2, num);
    }

    @NotNull
    public final ImageDocumentType component1() {
        return this.f90775a;
    }

    @NotNull
    public final String component2() {
        return this.f90776b;
    }

    @NotNull
    public final String component3() {
        return this.f90777c;
    }

    @Nullable
    public final ImageBitmap component4() {
        return this.f90778d;
    }

    public final boolean component5() {
        return this.f90779e;
    }

    @Nullable
    public final Integer component6() {
        return this.f90780f;
    }

    @NotNull
    public final ImageDocument copy(@NotNull ImageDocumentType imageDocumentType, @NotNull String name, @NotNull String imageName, @Nullable ImageBitmap imageBitmap, boolean z, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(imageDocumentType, "imageDocumentType");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(imageName, "imageName");
        return new ImageDocument(imageDocumentType, name, imageName, imageBitmap, z, num);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ImageDocument) {
            ImageDocument imageDocument = (ImageDocument) obj;
            return this.f90775a == imageDocument.f90775a && Intrinsics.areEqual(this.f90776b, imageDocument.f90776b) && Intrinsics.areEqual(this.f90777c, imageDocument.f90777c) && Intrinsics.areEqual(this.f90778d, imageDocument.f90778d) && this.f90779e == imageDocument.f90779e && Intrinsics.areEqual(this.f90780f, imageDocument.f90780f);
        }
        return false;
    }

    @Nullable
    public final ImageBitmap getImage() {
        return this.f90778d;
    }

    @NotNull
    public final ImageDocumentType getImageDocumentType() {
        return this.f90775a;
    }

    @NotNull
    public final String getImageName() {
        return this.f90777c;
    }

    @NotNull
    public final String getName() {
        return this.f90776b;
    }

    @Nullable
    public final Integer getSeq() {
        return this.f90780f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f90775a.hashCode() * 31) + this.f90776b.hashCode()) * 31) + this.f90777c.hashCode()) * 31;
        ImageBitmap imageBitmap = this.f90778d;
        int hashCode2 = (hashCode + (imageBitmap == null ? 0 : imageBitmap.hashCode())) * 31;
        boolean z = this.f90779e;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        Integer num = this.f90780f;
        return i2 + (num != null ? num.hashCode() : 0);
    }

    public final boolean isRequired() {
        return this.f90779e;
    }

    @NotNull
    public String toString() {
        ImageDocumentType imageDocumentType = this.f90775a;
        String str = this.f90776b;
        String str2 = this.f90777c;
        ImageBitmap imageBitmap = this.f90778d;
        boolean z = this.f90779e;
        Integer num = this.f90780f;
        return "ImageDocument(imageDocumentType=" + imageDocumentType + ", name=" + str + ", imageName=" + str2 + ", image=" + imageBitmap + ", isRequired=" + z + ", seq=" + num + ")";
    }

    public /* synthetic */ ImageDocument(ImageDocumentType imageDocumentType, String str, String str2, ImageBitmap imageBitmap, boolean z, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageDocumentType, str, str2, (i & 8) != 0 ? null : imageBitmap, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : num);
    }
}