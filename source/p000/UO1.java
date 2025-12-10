package p000;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.appcompat.widget.SearchView;
import androidx.core.content.ContextCompat;
import androidx.cursoradapter.widget.ResourceCursorAdapter;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: UO1 */
/* loaded from: classes.dex */
public class UO1 extends ResourceCursorAdapter implements View.OnClickListener {

    /* renamed from: d */
    public final SearchView f6303d;

    /* renamed from: e */
    public final SearchableInfo f6304e;

    /* renamed from: f */
    public final Context f6305f;

    /* renamed from: g */
    public final WeakHashMap f6306g;

    /* renamed from: h */
    public final int f6307h;

    /* renamed from: i */
    public boolean f6308i;

    /* renamed from: j */
    public int f6309j;

    /* renamed from: k */
    public ColorStateList f6310k;

    /* renamed from: l */
    public int f6311l;

    /* renamed from: m */
    public int f6312m;

    /* renamed from: n */
    public int f6313n;

    /* renamed from: o */
    public int f6314o;

    /* renamed from: p */
    public int f6315p;

    /* renamed from: q */
    public int f6316q;

    /* renamed from: UO1$a */
    /* loaded from: classes.dex */
    public static final class C1459a {

        /* renamed from: a */
        public final TextView f6317a;

        /* renamed from: b */
        public final TextView f6318b;

        /* renamed from: c */
        public final ImageView f6319c;

        /* renamed from: d */
        public final ImageView f6320d;

        /* renamed from: e */
        public final ImageView f6321e;

        public C1459a(View view) {
            this.f6317a = (TextView) view.findViewById(16908308);
            this.f6318b = (TextView) view.findViewById(16908309);
            this.f6319c = (ImageView) view.findViewById(16908295);
            this.f6320d = (ImageView) view.findViewById(16908296);
            this.f6321e = (ImageView) view.findViewById(R.id.edit_query);
        }
    }

    public UO1(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.f6308i = false;
        this.f6309j = 1;
        this.f6311l = -1;
        this.f6312m = -1;
        this.f6313n = -1;
        this.f6314o = -1;
        this.f6315p = -1;
        this.f6316q = -1;
        this.f6303d = searchView;
        this.f6304e = searchableInfo;
        this.f6307h = searchView.getSuggestionCommitIconResId();
        this.f6305f = context;
        this.f6306g = weakHashMap;
    }

    /* renamed from: f */
    public static String m66058f(Cursor cursor, String str) {
        return m66050n(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: n */
    public static String m66050n(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final Drawable m66062b(String str) {
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.f6306g.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public void bindView(View view, Context context, Cursor cursor) {
        int i;
        CharSequence m66050n;
        C1459a c1459a = (C1459a) view.getTag();
        int i2 = this.f6316q;
        if (i2 != -1) {
            i = cursor.getInt(i2);
        } else {
            i = 0;
        }
        if (c1459a.f6317a != null) {
            m66047q(c1459a.f6317a, m66050n(cursor, this.f6311l));
        }
        if (c1459a.f6318b != null) {
            String m66050n2 = m66050n(cursor, this.f6313n);
            if (m66050n2 != null) {
                m66050n = m66061c(m66050n2);
            } else {
                m66050n = m66050n(cursor, this.f6312m);
            }
            if (TextUtils.isEmpty(m66050n)) {
                TextView textView = c1459a.f6317a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    c1459a.f6317a.setMaxLines(2);
                }
            } else {
                TextView textView2 = c1459a.f6317a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    c1459a.f6317a.setMaxLines(1);
                }
            }
            m66047q(c1459a.f6318b, m66050n);
        }
        ImageView imageView = c1459a.f6319c;
        if (imageView != null) {
            m66048p(imageView, m66053k(cursor), 4);
        }
        ImageView imageView2 = c1459a.f6320d;
        if (imageView2 != null) {
            m66048p(imageView2, m66052l(cursor), 8);
        }
        int i3 = this.f6309j;
        if (i3 != 2 && (i3 != 1 || (i & 1) == 0)) {
            c1459a.f6321e.setVisibility(8);
            return;
        }
        c1459a.f6321e.setVisibility(0);
        c1459a.f6321e.setTag(c1459a.f6317a.getText());
        c1459a.f6321e.setOnClickListener(this);
    }

    /* renamed from: c */
    public final CharSequence m66061c(CharSequence charSequence) {
        if (this.f6310k == null) {
            TypedValue typedValue = new TypedValue();
            this.f6305f.getTheme().resolveAttribute(R.attr.textColorSearchUrl, typedValue, true);
            this.f6310k = this.f6305f.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f6310k, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.C4241a.InterfaceC4242a
    public void changeCursor(Cursor cursor) {
        if (this.f6308i) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.changeCursor(cursor);
            if (cursor != null) {
                this.f6311l = cursor.getColumnIndex("suggest_text_1");
                this.f6312m = cursor.getColumnIndex("suggest_text_2");
                this.f6313n = cursor.getColumnIndex("suggest_text_2_url");
                this.f6314o = cursor.getColumnIndex("suggest_icon_1");
                this.f6315p = cursor.getColumnIndex("suggest_icon_2");
                this.f6316q = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.C4241a.InterfaceC4242a
    public CharSequence convertToString(Cursor cursor) {
        String m66058f;
        String m66058f2;
        if (cursor == null) {
            return null;
        }
        String m66058f3 = m66058f(cursor, "suggest_intent_query");
        if (m66058f3 != null) {
            return m66058f3;
        }
        if (this.f6304e.shouldRewriteQueryFromData() && (m66058f2 = m66058f(cursor, "suggest_intent_data")) != null) {
            return m66058f2;
        }
        if (!this.f6304e.shouldRewriteQueryFromText() || (m66058f = m66058f(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return m66058f;
    }

    /* renamed from: d */
    public final Drawable m66060d(ComponentName componentName) {
        PackageManager packageManager = this.f6305f.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable == null) {
                Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
                return null;
            }
            return drawable;
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("SuggestionsAdapter", e.toString());
            return null;
        }
    }

    /* renamed from: e */
    public final Drawable m66059e(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        Drawable.ConstantState constantState = null;
        if (this.f6306g.containsKey(flattenToShortString)) {
            Drawable.ConstantState constantState2 = (Drawable.ConstantState) this.f6306g.get(flattenToShortString);
            if (constantState2 == null) {
                return null;
            }
            return constantState2.newDrawable(this.f6305f.getResources());
        }
        Drawable m66060d = m66060d(componentName);
        if (m66060d != null) {
            constantState = m66060d.getConstantState();
        }
        this.f6306g.put(flattenToShortString, constantState);
        return m66060d;
    }

    /* renamed from: g */
    public final Drawable m66057g() {
        Drawable m66059e = m66059e(this.f6304e.getSearchActivity());
        if (m66059e != null) {
            return m66059e;
        }
        return this.f6305f.getPackageManager().getDefaultActivityIcon();
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View newDropDownView = newDropDownView(this.f6305f, getCursor(), viewGroup);
            if (newDropDownView != null) {
                ((C1459a) newDropDownView.getTag()).f6317a.setText(e.toString());
            }
            return newDropDownView;
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View newView = newView(this.f6305f, getCursor(), viewGroup);
            if (newView != null) {
                ((C1459a) newView.getTag()).f6317a.setText(e.toString());
            }
            return newView;
        }
    }

    /* renamed from: h */
    public final Drawable m66056h(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return m66055i(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream openInputStream = this.f6305f.getContentResolver().openInputStream(uri);
            if (openInputStream != null) {
                Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
                try {
                    openInputStream.close();
                } catch (IOException unused2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Error closing icon stream for ");
                    sb.append(uri);
                }
                return createFromStream;
            }
            throw new FileNotFoundException("Failed to open " + uri);
        } catch (FileNotFoundException e) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e.getMessage());
        return null;
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    /* renamed from: i */
    public Drawable m66055i(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f6305f.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            parseInt = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (parseInt != 0) {
                        return resourcesForApplication.getDrawable(parseInt);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        }
        throw new FileNotFoundException("No authority: " + uri);
    }

    /* renamed from: j */
    public final Drawable m66054j(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f6305f.getPackageName() + RemoteSettings.FORWARD_SLASH_STRING + parseInt;
            Drawable m66062b = m66062b(str2);
            if (m66062b != null) {
                return m66062b;
            }
            Drawable drawable = ContextCompat.getDrawable(this.f6305f, parseInt);
            m66046r(str2, drawable);
            return drawable;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable m66062b2 = m66062b(str);
            if (m66062b2 != null) {
                return m66062b2;
            }
            Drawable m66056h = m66056h(Uri.parse(str));
            m66046r(str, m66056h);
            return m66056h;
        }
    }

    /* renamed from: k */
    public final Drawable m66053k(Cursor cursor) {
        int i = this.f6314o;
        if (i == -1) {
            return null;
        }
        Drawable m66054j = m66054j(cursor.getString(i));
        if (m66054j != null) {
            return m66054j;
        }
        return m66057g();
    }

    /* renamed from: l */
    public final Drawable m66052l(Cursor cursor) {
        int i = this.f6315p;
        if (i == -1) {
            return null;
        }
        return m66054j(cursor.getString(i));
    }

    /* renamed from: m */
    public Cursor m66051m(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f6305f.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // androidx.cursoradapter.widget.ResourceCursorAdapter, androidx.cursoradapter.widget.CursorAdapter
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        View newView = super.newView(context, cursor, viewGroup);
        newView.setTag(new C1459a(newView));
        ((ImageView) newView.findViewById(R.id.edit_query)).setImageResource(this.f6307h);
        return newView;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m66045s(getCursor());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m66045s(getCursor());
    }

    /* renamed from: o */
    public void m66049o(int i) {
        this.f6309j = i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f6303d.onQueryRefine((CharSequence) tag);
        }
    }

    /* renamed from: p */
    public final void m66048p(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* renamed from: q */
    public final void m66047q(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    /* renamed from: r */
    public final void m66046r(String str, Drawable drawable) {
        if (drawable != null) {
            this.f6306g.put(str, drawable.getConstantState());
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.C4241a.InterfaceC4242a
    public Cursor runQueryOnBackgroundThread(CharSequence charSequence) {
        String charSequence2;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        if (this.f6303d.getVisibility() == 0 && this.f6303d.getWindowVisibility() == 0) {
            try {
                Cursor m66051m = m66051m(this.f6304e, charSequence2, 50);
                if (m66051m != null) {
                    m66051m.getCount();
                    return m66051m;
                }
            } catch (RuntimeException e) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
            }
        }
        return null;
    }

    /* renamed from: s */
    public final void m66045s(Cursor cursor) {
        Bundle bundle;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }
}
