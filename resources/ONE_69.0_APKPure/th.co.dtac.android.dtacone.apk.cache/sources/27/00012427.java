package th.p047co.dtac.android.dtacone.presenter.p2post;

import android.util.Log;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import th.p047co.dtac.android.dtacone.util.constant.LanguageSupport;
import th.p047co.dtac.android.dtacone.util.date.DateUtil;

/* renamed from: th.co.dtac.android.dtacone.presenter.p2post.DatePresenter */
/* loaded from: classes8.dex */
public class DatePresenter {
    public String convertDateForValidate(String str) {
        try {
            return DateUtil.convertDate(str, "dd MMMM yyyy", new Locale(LanguageSupport.LANG_TH), true, "yyyyMMdd", new Locale(LanguageSupport.LANG_TH), true);
        } catch (ParseException e) {
            Log.getStackTraceString(e);
            return str;
        }
    }

    public String convertDateSpilt(String str) {
        try {
            return DateUtil.convertDate(str, "dd MMMM yyyy", new Locale(LanguageSupport.LANG_TH), true, DateUtil.FORMAT_BIRTH_DAY_NUMBER, new Locale(LanguageSupport.LANG_TH), false);
        } catch (ParseException e) {
            Log.getStackTraceString(e);
            return str;
        }
    }

    public String convertDateToBirthDay(int i, int i2, int i3) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(i, i2, i3);
        String format = new SimpleDateFormat("dd MMMM yyyy", new Locale(LanguageSupport.LANG_TH)).format(calendar.getTime());
        try {
            return DateUtil.convertDate(format, "dd MMMM yyyy", new Locale(LanguageSupport.LANG_TH), false, "dd MMMM yyyy", new Locale(LanguageSupport.LANG_TH), true);
        } catch (ParseException unused) {
            return format;
        }
    }
}