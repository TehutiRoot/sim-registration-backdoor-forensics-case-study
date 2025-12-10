package androidx.camera.camera2.internal;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.util.Size;
import android.view.Display;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.workaround.DisplaySizeCorrector;
import androidx.camera.camera2.internal.compat.workaround.MaxPreviewSize;
import androidx.camera.core.internal.utils.SizeUtil;
import com.feitian.readerdk.Tool.C6150DK;
import com.google.firebase.messaging.Constants;

@RequiresApi(21)
/* loaded from: classes.dex */
public class DisplayInfoManager {

    /* renamed from: e */
    public static final Size f10403e = new Size(1920, 1080);

    /* renamed from: f */
    public static final Size f10404f = new Size(320, C6150DK.ERROR_RECEIVE_LRC);

    /* renamed from: g */
    public static final Size f10405g = new Size(640, 480);

    /* renamed from: h */
    public static final Object f10406h = new Object();

    /* renamed from: i */
    public static volatile DisplayInfoManager f10407i;

    /* renamed from: a */
    public final DisplayManager f10408a;

    /* renamed from: b */
    public volatile Size f10409b = null;

    /* renamed from: c */
    public final MaxPreviewSize f10410c = new MaxPreviewSize();

    /* renamed from: d */
    public final DisplaySizeCorrector f10411d = new DisplaySizeCorrector();

    public DisplayInfoManager(Context context) {
        this.f10408a = (DisplayManager) context.getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
    }

    @NonNull
    public static DisplayInfoManager getInstance(@NonNull Context context) {
        if (f10407i == null) {
            synchronized (f10406h) {
                try {
                    if (f10407i == null) {
                        f10407i = new DisplayInfoManager(context);
                    }
                } finally {
                }
            }
        }
        return f10407i;
    }

    /* renamed from: a */
    public final Size m63784a() {
        Size m63783b = m63783b();
        int width = m63783b.getWidth() * m63783b.getHeight();
        Size size = f10403e;
        if (width > size.getWidth() * size.getHeight()) {
            m63783b = size;
        }
        return this.f10410c.getMaxPreviewResolution(m63783b);
    }

    /* renamed from: b */
    public final Size m63783b() {
        Point point = new Point();
        getMaxSizeDisplay(false).getRealSize(point);
        Size size = new Size(point.x, point.y);
        if (SizeUtil.isSmallerByArea(size, f10404f) && (size = this.f10411d.getDisplaySize()) == null) {
            size = f10405g;
        }
        if (size.getHeight() > size.getWidth()) {
            return new Size(size.getHeight(), size.getWidth());
        }
        return size;
    }

    /* renamed from: c */
    public final Display m63782c(Display[] displayArr, boolean z) {
        Display display = null;
        int i = -1;
        for (Display display2 : displayArr) {
            if (!z || display2.getState() != 1) {
                Point point = new Point();
                display2.getRealSize(point);
                int i2 = point.x;
                int i3 = point.y;
                if (i2 * i3 > i) {
                    display = display2;
                    i = i2 * i3;
                }
            }
        }
        return display;
    }

    /* renamed from: d */
    public Size m63781d() {
        if (this.f10409b != null) {
            return this.f10409b;
        }
        this.f10409b = m63784a();
        return this.f10409b;
    }

    /* renamed from: e */
    public void m63780e() {
        this.f10409b = m63784a();
    }

    @NonNull
    public Display getMaxSizeDisplay(boolean z) {
        Display[] displays = this.f10408a.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display m63782c = m63782c(displays, z);
        if (m63782c == null && z) {
            m63782c = m63782c(displays, false);
        }
        if (m63782c != null) {
            return m63782c;
        }
        throw new IllegalArgumentException("No display can be found from the input display manager!");
    }
}
