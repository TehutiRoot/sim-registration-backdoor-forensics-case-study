package th.p047co.dtac.android.dtacone.model.take_photo;

import android.graphics.Bitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.realm.CollectionUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\tJ\u0006\u0010\u001f\u001a\u00020 J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003JO\u0010&\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u000bHÖ\u0001J\u0014\u0010+\u001a\u00020 2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u0003J\t\u0010.\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000e\"\u0004\b\u001b\u0010\u0015¨\u0006/"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/take_photo/PhotoDataStore;", "", "photosList", "", "Lth/co/dtac/android/dtacone/model/take_photo/PhotoItem;", "requireList", "", "allRequireList", "previewImage", "Landroid/graphics/Bitmap;", "currentActivePosition", "", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroid/graphics/Bitmap;I)V", "getAllRequireList", "()Ljava/util/List;", "getCurrentActivePosition", "()I", "setCurrentActivePosition", "(I)V", "getPhotosList", "setPhotosList", "(Ljava/util/List;)V", "getPreviewImage", "()Landroid/graphics/Bitmap;", "setPreviewImage", "(Landroid/graphics/Bitmap;)V", "getRequireList", "setRequireList", "changePhotoListByIndex", FirebaseAnalytics.Param.INDEX, "src", "clearAllPhotoList", "", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "setPhotosItemList", CollectionUtils.LIST_TYPE, "Lth/co/dtac/android/dtacone/model/take_photo/PhotosModel;", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nPhotoDataStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhotoDataStore.kt\nth/co/dtac/android/dtacone/model/take_photo/PhotoDataStore\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,88:1\n766#2:89\n857#2,2:90\n1549#2:92\n1620#2,3:93\n766#2:96\n857#2,2:97\n1855#2,2:99\n1855#2,2:101\n1855#2,2:103\n*S KotlinDebug\n*F\n+ 1 PhotoDataStore.kt\nth/co/dtac/android/dtacone/model/take_photo/PhotoDataStore\n*L\n24#1:89\n24#1:90,2\n25#1:92\n25#1:93,3\n31#1:96\n31#1:97,2\n32#1:99,2\n41#1:101,2\n46#1:103,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.model.take_photo.PhotoDataStore */
/* loaded from: classes8.dex */
public final class PhotoDataStore {
    public static final int $stable = 8;
    @NotNull
    private final List<String> allRequireList;
    private int currentActivePosition;
    @NotNull
    private List<PhotoItem> photosList;
    @Nullable
    private Bitmap previewImage;
    @NotNull
    private List<String> requireList;

    public PhotoDataStore() {
        this(null, null, null, null, 0, 31, null);
    }

    public static /* synthetic */ PhotoDataStore copy$default(PhotoDataStore photoDataStore, List list, List list2, List list3, Bitmap bitmap, int i, int i2, Object obj) {
        List<PhotoItem> list4 = list;
        if ((i2 & 1) != 0) {
            list4 = photoDataStore.photosList;
        }
        List<String> list5 = list2;
        if ((i2 & 2) != 0) {
            list5 = photoDataStore.requireList;
        }
        List list6 = list5;
        List<String> list7 = list3;
        if ((i2 & 4) != 0) {
            list7 = photoDataStore.allRequireList;
        }
        List list8 = list7;
        if ((i2 & 8) != 0) {
            bitmap = photoDataStore.previewImage;
        }
        Bitmap bitmap2 = bitmap;
        if ((i2 & 16) != 0) {
            i = photoDataStore.currentActivePosition;
        }
        return photoDataStore.copy(list4, list6, list8, bitmap2, i);
    }

    @Nullable
    public final String changePhotoListByIndex(int i, @Nullable Bitmap bitmap) {
        this.photosList.get(i).setSrc(bitmap);
        if (this.photosList.get(i).isRequired()) {
            return this.photosList.get(i).getPosition();
        }
        return null;
    }

    public final void clearAllPhotoList() {
        for (PhotoItem photoItem : this.photosList) {
            photoItem.setSrc(null);
        }
        this.requireList.clear();
        for (String str : this.allRequireList) {
            this.requireList.add(str);
        }
    }

    @NotNull
    public final List<PhotoItem> component1() {
        return this.photosList;
    }

    @NotNull
    public final List<String> component2() {
        return this.requireList;
    }

    @NotNull
    public final List<String> component3() {
        return this.allRequireList;
    }

    @Nullable
    public final Bitmap component4() {
        return this.previewImage;
    }

    public final int component5() {
        return this.currentActivePosition;
    }

    @NotNull
    public final PhotoDataStore copy(@NotNull List<PhotoItem> photosList, @NotNull List<String> requireList, @NotNull List<String> allRequireList, @Nullable Bitmap bitmap, int i) {
        Intrinsics.checkNotNullParameter(photosList, "photosList");
        Intrinsics.checkNotNullParameter(requireList, "requireList");
        Intrinsics.checkNotNullParameter(allRequireList, "allRequireList");
        return new PhotoDataStore(photosList, requireList, allRequireList, bitmap, i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PhotoDataStore) {
            PhotoDataStore photoDataStore = (PhotoDataStore) obj;
            return Intrinsics.areEqual(this.photosList, photoDataStore.photosList) && Intrinsics.areEqual(this.requireList, photoDataStore.requireList) && Intrinsics.areEqual(this.allRequireList, photoDataStore.allRequireList) && Intrinsics.areEqual(this.previewImage, photoDataStore.previewImage) && this.currentActivePosition == photoDataStore.currentActivePosition;
        }
        return false;
    }

    @NotNull
    public final List<String> getAllRequireList() {
        return this.allRequireList;
    }

    public final int getCurrentActivePosition() {
        return this.currentActivePosition;
    }

    @NotNull
    public final List<PhotoItem> getPhotosList() {
        return this.photosList;
    }

    @Nullable
    public final Bitmap getPreviewImage() {
        return this.previewImage;
    }

    @NotNull
    public final List<String> getRequireList() {
        return this.requireList;
    }

    public int hashCode() {
        int hashCode = ((((this.photosList.hashCode() * 31) + this.requireList.hashCode()) * 31) + this.allRequireList.hashCode()) * 31;
        Bitmap bitmap = this.previewImage;
        return ((hashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + this.currentActivePosition;
    }

    public final void setCurrentActivePosition(int i) {
        this.currentActivePosition = i;
    }

    public final void setPhotosItemList(@NotNull List<PhotosModel> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        ArrayList<PhotosModel> arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((PhotosModel) obj).isSmartCard()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC10172es.collectionSizeOrDefault(arrayList, 10));
        for (PhotosModel photosModel : arrayList) {
            arrayList2.add(PhotoDataStoreKt.maptoItem(photosModel));
        }
        this.photosList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2);
        this.allRequireList.clear();
        this.requireList.clear();
        ArrayList<PhotosModel> arrayList3 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((PhotosModel) obj2).isRequired()) {
                arrayList3.add(obj2);
            }
        }
        for (PhotosModel photosModel2 : arrayList3) {
            this.allRequireList.add(photosModel2.getPosition());
            if (photosModel2.getSrc().length() == 0) {
                this.requireList.add(photosModel2.getPosition());
            }
        }
    }

    public final void setPhotosList(@NotNull List<PhotoItem> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.photosList = list;
    }

    public final void setPreviewImage(@Nullable Bitmap bitmap) {
        this.previewImage = bitmap;
    }

    public final void setRequireList(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.requireList = list;
    }

    @NotNull
    public String toString() {
        List<PhotoItem> list = this.photosList;
        List<String> list2 = this.requireList;
        List<String> list3 = this.allRequireList;
        Bitmap bitmap = this.previewImage;
        int i = this.currentActivePosition;
        return "PhotoDataStore(photosList=" + list + ", requireList=" + list2 + ", allRequireList=" + list3 + ", previewImage=" + bitmap + ", currentActivePosition=" + i + ")";
    }

    public PhotoDataStore(@NotNull List<PhotoItem> photosList, @NotNull List<String> requireList, @NotNull List<String> allRequireList, @Nullable Bitmap bitmap, int i) {
        Intrinsics.checkNotNullParameter(photosList, "photosList");
        Intrinsics.checkNotNullParameter(requireList, "requireList");
        Intrinsics.checkNotNullParameter(allRequireList, "allRequireList");
        this.photosList = photosList;
        this.requireList = requireList;
        this.allRequireList = allRequireList;
        this.previewImage = bitmap;
        this.currentActivePosition = i;
    }

    public /* synthetic */ PhotoDataStore(List list, List list2, List list3, Bitmap bitmap, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new ArrayList() : list, (i2 & 2) != 0 ? new ArrayList() : list2, (i2 & 4) != 0 ? new ArrayList() : list3, (i2 & 8) != 0 ? null : bitmap, (i2 & 16) != 0 ? 0 : i);
    }
}