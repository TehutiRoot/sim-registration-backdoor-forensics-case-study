package th.p047co.dtac.android.dtacone.widget;

import android.content.res.Resources;
import android.util.Log;
import androidx.annotation.NonNull;
import th.p047co.dtac.android.dtacone.manager.locale.LanguageService;
import th.p047co.dtac.android.dtacone.util.string.StringUtil;

/* renamed from: th.co.dtac.android.dtacone.widget.DtacResources */
/* loaded from: classes9.dex */
public class DtacResources extends Resources {

    /* renamed from: a */
    public LanguageService f107204a;

    public DtacResources(@NonNull Resources resources, LanguageService languageService) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f107204a = languageService;
    }

    @Override // android.content.res.Resources
    @NonNull
    public String getString(int i) throws Resources.NotFoundException {
        return getText(i).toString();
    }

    @Override // android.content.res.Resources
    @NonNull
    public CharSequence getText(int i) throws Resources.NotFoundException {
        String resourceEntryName = getResourceEntryName(i);
        if (StringUtil.hasText(resourceEntryName)) {
            if (this.f107204a.containsKey(resourceEntryName)) {
                String message = this.f107204a.getMessage(resourceEntryName);
                if (message == null) {
                    Log.w("DtacResources", "Message key " + resourceEntryName + " not in language map");
                    return "";
                }
                return message;
            }
            return super.getText(i);
        }
        throw new Resources.NotFoundException("Unable to find resource ID #0x" + Integer.toHexString(i));
    }
}