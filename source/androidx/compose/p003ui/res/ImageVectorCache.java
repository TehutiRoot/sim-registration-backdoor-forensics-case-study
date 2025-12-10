package androidx.compose.p003ui.res;

import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.compose.p003ui.graphics.vector.ImageVector;
import androidx.compose.runtime.internal.StabilityInferred;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationText;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ \u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0003R<\u0010\u0017\u001a*\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00130\u0012j\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0013`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, m28850d2 = {"Landroidx/compose/ui/res/ImageVectorCache;", "", "<init>", "()V", "Landroidx/compose/ui/res/ImageVectorCache$Key;", Action.KEY_ATTRIBUTE, "Landroidx/compose/ui/res/ImageVectorCache$ImageVectorEntry;", "get", "(Landroidx/compose/ui/res/ImageVectorCache$Key;)Landroidx/compose/ui/res/ImageVectorCache$ImageVectorEntry;", "", "configChanges", "", "prune", "(I)V", "imageVectorEntry", "set", "(Landroidx/compose/ui/res/ImageVectorCache$Key;Landroidx/compose/ui/res/ImageVectorCache$ImageVectorEntry;)V", "clear", "Ljava/util/HashMap;", "Ljava/lang/ref/WeakReference;", "Lkotlin/collections/HashMap;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/HashMap;", "map", "ImageVectorEntry", PDAnnotationText.NAME_KEY, "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.res.ImageVectorCache */
/* loaded from: classes2.dex */
public final class ImageVectorCache {

    /* renamed from: a */
    public final HashMap f30848a = new HashMap();

    @StabilityInferred(parameters = 0)
    @Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, m28850d2 = {"Landroidx/compose/ui/res/ImageVectorCache$ImageVectorEntry;", "", "Landroidx/compose/ui/graphics/vector/ImageVector;", "imageVector", "", "configFlags", "<init>", "(Landroidx/compose/ui/graphics/vector/ImageVector;I)V", "component1", "()Landroidx/compose/ui/graphics/vector/ImageVector;", "component2", "()I", "copy", "(Landroidx/compose/ui/graphics/vector/ImageVector;I)Landroidx/compose/ui/res/ImageVectorCache$ImageVectorEntry;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "getImageVector", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", "getConfigFlags", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.res.ImageVectorCache$ImageVectorEntry */
    /* loaded from: classes2.dex */
    public static final class ImageVectorEntry {
        public static final int $stable = 0;

        /* renamed from: a */
        public final ImageVector f30849a;

        /* renamed from: b */
        public final int f30850b;

        public ImageVectorEntry(@NotNull ImageVector imageVector, int i) {
            Intrinsics.checkNotNullParameter(imageVector, "imageVector");
            this.f30849a = imageVector;
            this.f30850b = i;
        }

        public static /* synthetic */ ImageVectorEntry copy$default(ImageVectorEntry imageVectorEntry, ImageVector imageVector, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                imageVector = imageVectorEntry.f30849a;
            }
            if ((i2 & 2) != 0) {
                i = imageVectorEntry.f30850b;
            }
            return imageVectorEntry.copy(imageVector, i);
        }

        @NotNull
        public final ImageVector component1() {
            return this.f30849a;
        }

        public final int component2() {
            return this.f30850b;
        }

        @NotNull
        public final ImageVectorEntry copy(@NotNull ImageVector imageVector, int i) {
            Intrinsics.checkNotNullParameter(imageVector, "imageVector");
            return new ImageVectorEntry(imageVector, i);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ImageVectorEntry) {
                ImageVectorEntry imageVectorEntry = (ImageVectorEntry) obj;
                return Intrinsics.areEqual(this.f30849a, imageVectorEntry.f30849a) && this.f30850b == imageVectorEntry.f30850b;
            }
            return false;
        }

        public final int getConfigFlags() {
            return this.f30850b;
        }

        @NotNull
        public final ImageVector getImageVector() {
            return this.f30849a;
        }

        public int hashCode() {
            return (this.f30849a.hashCode() * 31) + this.f30850b;
        }

        @NotNull
        public String toString() {
            return "ImageVectorEntry(imageVector=" + this.f30849a + ", configFlags=" + this.f30850b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m28851d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\t\u001a\u00060\u0002R\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\r\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002R\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\f¨\u0006\u001d"}, m28850d2 = {"Landroidx/compose/ui/res/ImageVectorCache$Key;", "", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "theme", "", "id", "<init>", "(Landroid/content/res/Resources$Theme;I)V", "component1", "()Landroid/content/res/Resources$Theme;", "component2", "()I", "copy", "(Landroid/content/res/Resources$Theme;I)Landroidx/compose/ui/res/ImageVectorCache$Key;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/content/res/Resources$Theme;", "getTheme", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", "getId", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.res.ImageVectorCache$Key */
    /* loaded from: classes2.dex */
    public static final class Key {
        public static final int $stable = 8;

        /* renamed from: a */
        public final Resources.Theme f30851a;

        /* renamed from: b */
        public final int f30852b;

        public Key(@NotNull Resources.Theme theme, int i) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            this.f30851a = theme;
            this.f30852b = i;
        }

        public static /* synthetic */ Key copy$default(Key key, Resources.Theme theme, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                theme = key.f30851a;
            }
            if ((i2 & 2) != 0) {
                i = key.f30852b;
            }
            return key.copy(theme, i);
        }

        @NotNull
        public final Resources.Theme component1() {
            return this.f30851a;
        }

        public final int component2() {
            return this.f30852b;
        }

        @NotNull
        public final Key copy(@NotNull Resources.Theme theme, int i) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            return new Key(theme, i);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Key) {
                Key key = (Key) obj;
                return Intrinsics.areEqual(this.f30851a, key.f30851a) && this.f30852b == key.f30852b;
            }
            return false;
        }

        public final int getId() {
            return this.f30852b;
        }

        @NotNull
        public final Resources.Theme getTheme() {
            return this.f30851a;
        }

        public int hashCode() {
            return (this.f30851a.hashCode() * 31) + this.f30852b;
        }

        @NotNull
        public String toString() {
            return "Key(theme=" + this.f30851a + ", id=" + this.f30852b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public final void clear() {
        this.f30848a.clear();
    }

    @Nullable
    public final ImageVectorEntry get(@NotNull Key key) {
        Intrinsics.checkNotNullParameter(key, "key");
        WeakReference weakReference = (WeakReference) this.f30848a.get(key);
        if (weakReference != null) {
            return (ImageVectorEntry) weakReference.get();
        }
        return null;
    }

    public final void prune(int i) {
        Iterator it = this.f30848a.entrySet().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "it.next()");
            ImageVectorEntry imageVectorEntry = (ImageVectorEntry) ((WeakReference) ((Map.Entry) next).getValue()).get();
            if (imageVectorEntry == null || Configuration.needNewResources(i, imageVectorEntry.getConfigFlags())) {
                it.remove();
            }
        }
    }

    public final void set(@NotNull Key key, @NotNull ImageVectorEntry imageVectorEntry) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(imageVectorEntry, "imageVectorEntry");
        this.f30848a.put(key, new WeakReference(imageVectorEntry));
    }
}
