package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.R;
import androidx.core.app.Person;
import androidx.core.content.ContextCompat;
import androidx.core.content.LocusIdCompat;
import androidx.core.content.p004pm.ShortcutInfoCompat;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.text.BidiFormatter;
import androidx.core.view.GravityCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.bouncycastle.i18n.TextBundle;

/* loaded from: classes2.dex */
public class NotificationCompat {
    public static final int BADGE_ICON_LARGE = 2;
    public static final int BADGE_ICON_NONE = 0;
    public static final int BADGE_ICON_SMALL = 1;
    public static final String CATEGORY_ALARM = "alarm";
    public static final String CATEGORY_CALL = "call";
    public static final String CATEGORY_EMAIL = "email";
    public static final String CATEGORY_ERROR = "err";
    public static final String CATEGORY_EVENT = "event";
    public static final String CATEGORY_LOCATION_SHARING = "location_sharing";
    public static final String CATEGORY_MESSAGE = "msg";
    public static final String CATEGORY_MISSED_CALL = "missed_call";
    public static final String CATEGORY_NAVIGATION = "navigation";
    public static final String CATEGORY_PROGRESS = "progress";
    public static final String CATEGORY_PROMO = "promo";
    public static final String CATEGORY_RECOMMENDATION = "recommendation";
    public static final String CATEGORY_REMINDER = "reminder";
    public static final String CATEGORY_SERVICE = "service";
    public static final String CATEGORY_SOCIAL = "social";
    public static final String CATEGORY_STATUS = "status";
    public static final String CATEGORY_STOPWATCH = "stopwatch";
    public static final String CATEGORY_SYSTEM = "sys";
    public static final String CATEGORY_TRANSPORT = "transport";
    public static final String CATEGORY_WORKOUT = "workout";
    @ColorInt
    public static final int COLOR_DEFAULT = 0;
    public static final int DEFAULT_ALL = -1;
    public static final int DEFAULT_LIGHTS = 4;
    public static final int DEFAULT_SOUND = 1;
    public static final int DEFAULT_VIBRATE = 2;
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_ANSWER_COLOR = "android.answerColor";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_ANSWER_INTENT = "android.answerIntent";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_AUDIO_CONTENTS_URI = "android.audioContents";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_BACKGROUND_IMAGE_URI = "android.backgroundImageUri";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_BIG_TEXT = "android.bigText";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CALL_IS_VIDEO = "android.callIsVideo";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CALL_PERSON = "android.callPerson";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CALL_PERSON_COMPAT = "android.callPersonCompat";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CALL_TYPE = "android.callType";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CHANNEL_GROUP_ID = "android.intent.extra.CHANNEL_GROUP_ID";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CHANNEL_ID = "android.intent.extra.CHANNEL_ID";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CHRONOMETER_COUNT_DOWN = "android.chronometerCountDown";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_COLORIZED = "android.colorized";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_COMPACT_ACTIONS = "android.compactActions";
    public static final String EXTRA_COMPAT_TEMPLATE = "androidx.core.app.extra.COMPAT_TEMPLATE";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CONVERSATION_TITLE = "android.conversationTitle";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_DECLINE_COLOR = "android.declineColor";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_DECLINE_INTENT = "android.declineIntent";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_HANG_UP_INTENT = "android.hangUpIntent";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_HIDDEN_CONVERSATION_TITLE = "android.hiddenConversationTitle";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_HISTORIC_MESSAGES = "android.messages.historic";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_INFO_TEXT = "android.infoText";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_IS_GROUP_CONVERSATION = "android.isGroupConversation";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_LARGE_ICON = "android.largeIcon";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_LARGE_ICON_BIG = "android.largeIcon.big";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_MEDIA_SESSION = "android.mediaSession";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_MESSAGES = "android.messages";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_MESSAGING_STYLE_USER = "android.messagingStyleUser";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_NOTIFICATION_ID = "android.intent.extra.NOTIFICATION_ID";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_NOTIFICATION_TAG = "android.intent.extra.NOTIFICATION_TAG";
    @SuppressLint({"ActionValue"})
    @Deprecated
    public static final String EXTRA_PEOPLE = "android.people";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PEOPLE_LIST = "android.people.list";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PICTURE = "android.picture";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PICTURE_CONTENT_DESCRIPTION = "android.pictureContentDescription";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PICTURE_ICON = "android.pictureIcon";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PROGRESS = "android.progress";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PROGRESS_INDETERMINATE = "android.progressIndeterminate";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PROGRESS_MAX = "android.progressMax";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_REMOTE_INPUT_HISTORY = "android.remoteInputHistory";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SELF_DISPLAY_NAME = "android.selfDisplayName";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED = "android.showBigPictureWhenCollapsed";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SHOW_CHRONOMETER = "android.showChronometer";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SHOW_WHEN = "android.showWhen";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SMALL_ICON = "android.icon";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SUB_TEXT = "android.subText";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SUMMARY_TEXT = "android.summaryText";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_TEMPLATE = "android.template";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_TEXT = "android.text";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_TEXT_LINES = "android.textLines";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_TITLE = "android.title";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_TITLE_BIG = "android.title.big";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_VERIFICATION_ICON = "android.verificationIcon";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_VERIFICATION_ICON_COMPAT = "android.verificationIconCompat";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_VERIFICATION_TEXT = "android.verificationText";
    public static final int FLAG_AUTO_CANCEL = 16;
    public static final int FLAG_BUBBLE = 4096;
    public static final int FLAG_FOREGROUND_SERVICE = 64;
    public static final int FLAG_GROUP_SUMMARY = 512;
    @Deprecated
    public static final int FLAG_HIGH_PRIORITY = 128;
    public static final int FLAG_INSISTENT = 4;
    public static final int FLAG_LOCAL_ONLY = 256;
    public static final int FLAG_NO_CLEAR = 32;
    public static final int FLAG_ONGOING_EVENT = 2;
    public static final int FLAG_ONLY_ALERT_ONCE = 8;
    public static final int FLAG_SHOW_LIGHTS = 1;
    public static final int FOREGROUND_SERVICE_DEFAULT = 0;
    public static final int FOREGROUND_SERVICE_DEFERRED = 2;
    public static final int FOREGROUND_SERVICE_IMMEDIATE = 1;
    public static final int GROUP_ALERT_ALL = 0;
    public static final int GROUP_ALERT_CHILDREN = 2;
    public static final int GROUP_ALERT_SUMMARY = 1;
    public static final String GROUP_KEY_SILENT = "silent";
    @SuppressLint({"ActionValue"})
    public static final String INTENT_CATEGORY_NOTIFICATION_PREFERENCES = "android.intent.category.NOTIFICATION_PREFERENCES";
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int MAX_ACTION_BUTTONS = 3;
    public static final int PRIORITY_DEFAULT = 0;
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_LOW = -1;
    public static final int PRIORITY_MAX = 2;
    public static final int PRIORITY_MIN = -2;
    public static final int STREAM_DEFAULT = -1;
    public static final int VISIBILITY_PRIVATE = 0;
    public static final int VISIBILITY_PUBLIC = 1;
    public static final int VISIBILITY_SECRET = -1;

    /* loaded from: classes2.dex */
    public static class Action {
        public static final int SEMANTIC_ACTION_ARCHIVE = 5;
        public static final int SEMANTIC_ACTION_CALL = 10;
        public static final int SEMANTIC_ACTION_DELETE = 4;
        public static final int SEMANTIC_ACTION_MARK_AS_READ = 2;
        public static final int SEMANTIC_ACTION_MARK_AS_UNREAD = 3;
        public static final int SEMANTIC_ACTION_MUTE = 6;
        public static final int SEMANTIC_ACTION_NONE = 0;
        public static final int SEMANTIC_ACTION_REPLY = 1;
        public static final int SEMANTIC_ACTION_THUMBS_DOWN = 9;
        public static final int SEMANTIC_ACTION_THUMBS_UP = 8;
        public static final int SEMANTIC_ACTION_UNMUTE = 7;

        /* renamed from: a */
        public final Bundle f33601a;
        @Nullable
        public PendingIntent actionIntent;

        /* renamed from: b */
        public IconCompat f33602b;

        /* renamed from: c */
        public final RemoteInput[] f33603c;

        /* renamed from: d */
        public final RemoteInput[] f33604d;

        /* renamed from: e */
        public boolean f33605e;

        /* renamed from: f */
        public boolean f33606f;

        /* renamed from: g */
        public final int f33607g;

        /* renamed from: h */
        public final boolean f33608h;

        /* renamed from: i */
        public boolean f33609i;
        @Deprecated
        public int icon;
        public CharSequence title;

        /* loaded from: classes2.dex */
        public static final class Builder {

            /* renamed from: a */
            public final IconCompat f33610a;

            /* renamed from: b */
            public final CharSequence f33611b;

            /* renamed from: c */
            public final PendingIntent f33612c;

            /* renamed from: d */
            public boolean f33613d;

            /* renamed from: e */
            public final Bundle f33614e;

            /* renamed from: f */
            public ArrayList f33615f;

            /* renamed from: g */
            public int f33616g;

            /* renamed from: h */
            public boolean f33617h;

            /* renamed from: i */
            public boolean f33618i;

            /* renamed from: j */
            public boolean f33619j;

            /* renamed from: androidx.core.app.NotificationCompat$Action$Builder$a */
            /* loaded from: classes2.dex */
            public static class C3840a {
                @DoNotInline
                /* renamed from: a */
                public static android.app.RemoteInput[] m57805a(Notification.Action action) {
                    return action.getRemoteInputs();
                }
            }

            /* renamed from: androidx.core.app.NotificationCompat$Action$Builder$b */
            /* loaded from: classes2.dex */
            public static class C3841b {
                @DoNotInline
                /* renamed from: a */
                public static Icon m57804a(Notification.Action action) {
                    return action.getIcon();
                }
            }

            /* renamed from: androidx.core.app.NotificationCompat$Action$Builder$c */
            /* loaded from: classes2.dex */
            public static class C3842c {
                @DoNotInline
                /* renamed from: a */
                public static boolean m57803a(Notification.Action action) {
                    return action.getAllowGeneratedReplies();
                }
            }

            /* renamed from: androidx.core.app.NotificationCompat$Action$Builder$d */
            /* loaded from: classes2.dex */
            public static class C3843d {
                @DoNotInline
                /* renamed from: a */
                public static int m57802a(Notification.Action action) {
                    return action.getSemanticAction();
                }
            }

            /* renamed from: androidx.core.app.NotificationCompat$Action$Builder$e */
            /* loaded from: classes2.dex */
            public static class C3844e {
                @DoNotInline
                /* renamed from: a */
                public static boolean m57801a(Notification.Action action) {
                    return action.isContextual();
                }
            }

            /* renamed from: androidx.core.app.NotificationCompat$Action$Builder$f */
            /* loaded from: classes2.dex */
            public static class C3845f {
                @DoNotInline
                /* renamed from: a */
                public static boolean m57800a(Notification.Action action) {
                    return action.isAuthenticationRequired();
                }
            }

            public Builder(@Nullable IconCompat iconCompat, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            @NonNull
            @RequiresApi(19)
            @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
            public static Builder fromAndroidAction(@NonNull Notification.Action action) {
                Builder builder;
                if (Build.VERSION.SDK_INT >= 23 && C3841b.m57804a(action) != null) {
                    builder = new Builder(IconCompat.createFromIconOrNullIfZeroResId(C3841b.m57804a(action)), action.title, action.actionIntent);
                } else {
                    builder = new Builder(action.icon, action.title, action.actionIntent);
                }
                android.app.RemoteInput[] m57805a = C3840a.m57805a(action);
                if (m57805a != null && m57805a.length != 0) {
                    for (android.app.RemoteInput remoteInput : m57805a) {
                        builder.addRemoteInput(RemoteInput.m57595c(remoteInput));
                    }
                }
                int i = Build.VERSION.SDK_INT;
                if (i >= 24) {
                    builder.f33613d = C3842c.m57803a(action);
                }
                if (i >= 28) {
                    builder.setSemanticAction(C3843d.m57802a(action));
                }
                if (i >= 29) {
                    builder.setContextual(C3844e.m57801a(action));
                }
                if (i >= 31) {
                    builder.setAuthenticationRequired(C3845f.m57800a(action));
                }
                return builder;
            }

            /* renamed from: a */
            public final void m57806a() {
                if (!this.f33618i || this.f33612c != null) {
                    return;
                }
                throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
            }

            @NonNull
            public Builder addExtras(@Nullable Bundle bundle) {
                if (bundle != null) {
                    this.f33614e.putAll(bundle);
                }
                return this;
            }

            @NonNull
            public Builder addRemoteInput(@Nullable RemoteInput remoteInput) {
                if (this.f33615f == null) {
                    this.f33615f = new ArrayList();
                }
                if (remoteInput != null) {
                    this.f33615f.add(remoteInput);
                }
                return this;
            }

            @NonNull
            public Action build() {
                RemoteInput[] remoteInputArr;
                m57806a();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = this.f33615f;
                if (arrayList3 != null) {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        RemoteInput remoteInput = (RemoteInput) it.next();
                        if (remoteInput.isDataOnly()) {
                            arrayList.add(remoteInput);
                        } else {
                            arrayList2.add(remoteInput);
                        }
                    }
                }
                RemoteInput[] remoteInputArr2 = null;
                if (arrayList.isEmpty()) {
                    remoteInputArr = null;
                } else {
                    remoteInputArr = (RemoteInput[]) arrayList.toArray(new RemoteInput[arrayList.size()]);
                }
                if (!arrayList2.isEmpty()) {
                    remoteInputArr2 = (RemoteInput[]) arrayList2.toArray(new RemoteInput[arrayList2.size()]);
                }
                return new Action(this.f33610a, this.f33611b, this.f33612c, this.f33614e, remoteInputArr2, remoteInputArr, this.f33613d, this.f33616g, this.f33617h, this.f33618i, this.f33619j);
            }

            @NonNull
            public Builder extend(@NonNull Extender extender) {
                extender.extend(this);
                return this;
            }

            @NonNull
            public Bundle getExtras() {
                return this.f33614e;
            }

            @NonNull
            public Builder setAllowGeneratedReplies(boolean z) {
                this.f33613d = z;
                return this;
            }

            @NonNull
            public Builder setAuthenticationRequired(boolean z) {
                this.f33619j = z;
                return this;
            }

            @NonNull
            public Builder setContextual(boolean z) {
                this.f33618i = z;
                return this;
            }

            @NonNull
            public Builder setSemanticAction(int i) {
                this.f33616g = i;
                return this;
            }

            @NonNull
            public Builder setShowsUserInterface(boolean z) {
                this.f33617h = z;
                return this;
            }

            public Builder(int i, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent) {
                this(i != 0 ? IconCompat.createWithResource(null, "", i) : null, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            public Builder(@NonNull Action action) {
                this(action.getIconCompat(), action.title, action.actionIntent, new Bundle(action.f33601a), action.getRemoteInputs(), action.getAllowGeneratedReplies(), action.getSemanticAction(), action.f33606f, action.isContextual(), action.isAuthenticationRequired());
            }

            public Builder(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, RemoteInput[] remoteInputArr, boolean z, int i, boolean z2, boolean z3, boolean z4) {
                this.f33613d = true;
                this.f33617h = true;
                this.f33610a = iconCompat;
                this.f33611b = Builder.limitCharSequenceLength(charSequence);
                this.f33612c = pendingIntent;
                this.f33614e = bundle;
                this.f33615f = remoteInputArr == null ? null : new ArrayList(Arrays.asList(remoteInputArr));
                this.f33613d = z;
                this.f33616g = i;
                this.f33617h = z2;
                this.f33618i = z3;
                this.f33619j = z4;
            }
        }

        /* loaded from: classes2.dex */
        public interface Extender {
            @NonNull
            Builder extend(@NonNull Builder builder);
        }

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes2.dex */
        public @interface SemanticAction {
        }

        /* loaded from: classes2.dex */
        public static final class WearableExtender implements Extender {

            /* renamed from: a */
            public int f33620a;

            /* renamed from: b */
            public CharSequence f33621b;

            /* renamed from: c */
            public CharSequence f33622c;

            /* renamed from: d */
            public CharSequence f33623d;

            public WearableExtender() {
                this.f33620a = 1;
            }

            /* renamed from: a */
            public final void m57799a(int i, boolean z) {
                if (z) {
                    this.f33620a = i | this.f33620a;
                    return;
                }
                this.f33620a = (~i) & this.f33620a;
            }

            @Override // androidx.core.app.NotificationCompat.Action.Extender
            @NonNull
            public Builder extend(@NonNull Builder builder) {
                Bundle bundle = new Bundle();
                int i = this.f33620a;
                if (i != 1) {
                    bundle.putInt("flags", i);
                }
                CharSequence charSequence = this.f33621b;
                if (charSequence != null) {
                    bundle.putCharSequence("inProgressLabel", charSequence);
                }
                CharSequence charSequence2 = this.f33622c;
                if (charSequence2 != null) {
                    bundle.putCharSequence("confirmLabel", charSequence2);
                }
                CharSequence charSequence3 = this.f33623d;
                if (charSequence3 != null) {
                    bundle.putCharSequence("cancelLabel", charSequence3);
                }
                builder.getExtras().putBundle("android.wearable.EXTENSIONS", bundle);
                return builder;
            }

            @Nullable
            @Deprecated
            public CharSequence getCancelLabel() {
                return this.f33623d;
            }

            @Nullable
            @Deprecated
            public CharSequence getConfirmLabel() {
                return this.f33622c;
            }

            public boolean getHintDisplayActionInline() {
                if ((this.f33620a & 4) != 0) {
                    return true;
                }
                return false;
            }

            public boolean getHintLaunchesActivity() {
                if ((this.f33620a & 2) != 0) {
                    return true;
                }
                return false;
            }

            @Nullable
            @Deprecated
            public CharSequence getInProgressLabel() {
                return this.f33621b;
            }

            public boolean isAvailableOffline() {
                if ((this.f33620a & 1) != 0) {
                    return true;
                }
                return false;
            }

            @NonNull
            public WearableExtender setAvailableOffline(boolean z) {
                m57799a(1, z);
                return this;
            }

            @NonNull
            @Deprecated
            public WearableExtender setCancelLabel(@Nullable CharSequence charSequence) {
                this.f33623d = charSequence;
                return this;
            }

            @NonNull
            @Deprecated
            public WearableExtender setConfirmLabel(@Nullable CharSequence charSequence) {
                this.f33622c = charSequence;
                return this;
            }

            @NonNull
            public WearableExtender setHintDisplayActionInline(boolean z) {
                m57799a(4, z);
                return this;
            }

            @NonNull
            public WearableExtender setHintLaunchesActivity(boolean z) {
                m57799a(2, z);
                return this;
            }

            @NonNull
            @Deprecated
            public WearableExtender setInProgressLabel(@Nullable CharSequence charSequence) {
                this.f33621b = charSequence;
                return this;
            }

            @NonNull
            /* renamed from: clone */
            public WearableExtender m74089clone() {
                WearableExtender wearableExtender = new WearableExtender();
                wearableExtender.f33620a = this.f33620a;
                wearableExtender.f33621b = this.f33621b;
                wearableExtender.f33622c = this.f33622c;
                wearableExtender.f33623d = this.f33623d;
                return wearableExtender;
            }

            public WearableExtender(@NonNull Action action) {
                this.f33620a = 1;
                Bundle bundle = action.getExtras().getBundle("android.wearable.EXTENSIONS");
                if (bundle != null) {
                    this.f33620a = bundle.getInt("flags", 1);
                    this.f33621b = bundle.getCharSequence("inProgressLabel");
                    this.f33622c = bundle.getCharSequence("confirmLabel");
                    this.f33623d = bundle.getCharSequence("cancelLabel");
                }
            }
        }

        public Action(int i, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent) {
            this(i != 0 ? IconCompat.createWithResource(null, "", i) : null, charSequence, pendingIntent);
        }

        @Nullable
        public PendingIntent getActionIntent() {
            return this.actionIntent;
        }

        public boolean getAllowGeneratedReplies() {
            return this.f33605e;
        }

        @Nullable
        public RemoteInput[] getDataOnlyRemoteInputs() {
            return this.f33604d;
        }

        @NonNull
        public Bundle getExtras() {
            return this.f33601a;
        }

        @Deprecated
        public int getIcon() {
            return this.icon;
        }

        @Nullable
        public IconCompat getIconCompat() {
            int i;
            if (this.f33602b == null && (i = this.icon) != 0) {
                this.f33602b = IconCompat.createWithResource(null, "", i);
            }
            return this.f33602b;
        }

        @Nullable
        public RemoteInput[] getRemoteInputs() {
            return this.f33603c;
        }

        public int getSemanticAction() {
            return this.f33607g;
        }

        public boolean getShowsUserInterface() {
            return this.f33606f;
        }

        @Nullable
        public CharSequence getTitle() {
            return this.title;
        }

        public boolean isAuthenticationRequired() {
            return this.f33609i;
        }

        public boolean isContextual() {
            return this.f33608h;
        }

        public Action(@Nullable IconCompat iconCompat, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (RemoteInput[]) null, (RemoteInput[]) null, true, 0, true, false, false);
        }

        public Action(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, RemoteInput[] remoteInputArr, RemoteInput[] remoteInputArr2, boolean z, int i2, boolean z2, boolean z3, boolean z4) {
            this(i != 0 ? IconCompat.createWithResource(null, "", i) : null, charSequence, pendingIntent, bundle, remoteInputArr, remoteInputArr2, z, i2, z2, z3, z4);
        }

        public Action(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, RemoteInput[] remoteInputArr, RemoteInput[] remoteInputArr2, boolean z, int i, boolean z2, boolean z3, boolean z4) {
            this.f33606f = true;
            this.f33602b = iconCompat;
            if (iconCompat != null && iconCompat.getType() == 2) {
                this.icon = iconCompat.getResId();
            }
            this.title = Builder.limitCharSequenceLength(charSequence);
            this.actionIntent = pendingIntent;
            this.f33601a = bundle == null ? new Bundle() : bundle;
            this.f33603c = remoteInputArr;
            this.f33604d = remoteInputArr2;
            this.f33605e = z;
            this.f33607g = i;
            this.f33606f = z2;
            this.f33608h = z3;
            this.f33609i = z4;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes2.dex */
    public @interface BadgeIconType {
    }

    /* loaded from: classes2.dex */
    public static class BigPictureStyle extends Style {

        /* renamed from: d */
        public IconCompat f33624d;

        /* renamed from: e */
        public IconCompat f33625e;

        /* renamed from: f */
        public boolean f33626f;

        /* renamed from: g */
        public CharSequence f33627g;

        /* renamed from: h */
        public boolean f33628h;

        /* renamed from: androidx.core.app.NotificationCompat$BigPictureStyle$a */
        /* loaded from: classes2.dex */
        public static class C3846a {
            @DoNotInline
            /* renamed from: a */
            public static Notification.BigPictureStyle m57797a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                return bigPictureStyle.bigPicture(bitmap);
            }

            @DoNotInline
            /* renamed from: b */
            public static Notification.BigPictureStyle m57796b(Notification.Builder builder) {
                return new Notification.BigPictureStyle(builder);
            }

            @DoNotInline
            /* renamed from: c */
            public static Notification.BigPictureStyle m57795c(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                return bigPictureStyle.setBigContentTitle(charSequence);
            }

            @RequiresApi(16)
            /* renamed from: d */
            public static void m57794d(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            @RequiresApi(16)
            /* renamed from: e */
            public static void m57793e(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$BigPictureStyle$b */
        /* loaded from: classes2.dex */
        public static class C3847b {
            @RequiresApi(23)
            /* renamed from: a */
            public static void m57792a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$BigPictureStyle$c */
        /* loaded from: classes2.dex */
        public static class C3848c {
            @RequiresApi(31)
            /* renamed from: a */
            public static void m57791a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            @RequiresApi(31)
            /* renamed from: b */
            public static void m57790b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            @RequiresApi(31)
            /* renamed from: c */
            public static void m57789c(Notification.BigPictureStyle bigPictureStyle, boolean z) {
                bigPictureStyle.showBigPictureWhenCollapsed(z);
            }
        }

        public BigPictureStyle() {
        }

        @Nullable
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public static IconCompat getPictureIcon(@Nullable Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            Parcelable parcelable = bundle.getParcelable(NotificationCompat.EXTRA_PICTURE);
            if (parcelable != null) {
                return m57798l(parcelable);
            }
            return m57798l(bundle.getParcelable(NotificationCompat.EXTRA_PICTURE_ICON));
        }

        /* renamed from: l */
        public static IconCompat m57798l(Parcelable parcelable) {
            if (parcelable != null) {
                if (Build.VERSION.SDK_INT >= 23 && AbstractC19553dJ0.m31849a(parcelable)) {
                    return IconCompat.createFromIcon(AbstractC19726eJ0.m31726a(parcelable));
                }
                if (parcelable instanceof Bitmap) {
                    return IconCompat.createWithBitmap((Bitmap) parcelable);
                }
                return null;
            }
            return null;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            Context context;
            int i = Build.VERSION.SDK_INT;
            Notification.BigPictureStyle m57795c = C3846a.m57795c(C3846a.m57796b(notificationBuilderWithBuilderAccessor.getBuilder()), this.f33727a);
            IconCompat iconCompat = this.f33624d;
            Context context2 = null;
            if (iconCompat != null) {
                if (i >= 31) {
                    if (notificationBuilderWithBuilderAccessor instanceof C3911a) {
                        context = ((C3911a) notificationBuilderWithBuilderAccessor).m57563e();
                    } else {
                        context = null;
                    }
                    C3848c.m57791a(m57795c, this.f33624d.toIcon(context));
                } else if (iconCompat.getType() == 1) {
                    m57795c = C3846a.m57797a(m57795c, this.f33624d.getBitmap());
                }
            }
            if (this.f33626f) {
                IconCompat iconCompat2 = this.f33625e;
                if (iconCompat2 == null) {
                    C3846a.m57794d(m57795c, null);
                } else if (i >= 23) {
                    if (notificationBuilderWithBuilderAccessor instanceof C3911a) {
                        context2 = ((C3911a) notificationBuilderWithBuilderAccessor).m57563e();
                    }
                    C3847b.m57792a(m57795c, this.f33625e.toIcon(context2));
                } else if (iconCompat2.getType() == 1) {
                    C3846a.m57794d(m57795c, this.f33625e.getBitmap());
                } else {
                    C3846a.m57794d(m57795c, null);
                }
            }
            if (this.f33729c) {
                C3846a.m57793e(m57795c, this.f33728b);
            }
            if (i >= 31) {
                C3848c.m57789c(m57795c, this.f33628h);
                C3848c.m57790b(m57795c, this.f33627g);
            }
        }

        @NonNull
        public BigPictureStyle bigLargeIcon(@Nullable Bitmap bitmap) {
            this.f33625e = bitmap == null ? null : IconCompat.createWithBitmap(bitmap);
            this.f33626f = true;
            return this;
        }

        @NonNull
        public BigPictureStyle bigPicture(@Nullable Bitmap bitmap) {
            this.f33624d = bitmap == null ? null : IconCompat.createWithBitmap(bitmap);
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void clearCompatExtraKeys(@NonNull Bundle bundle) {
            super.clearCompatExtraKeys(bundle);
            bundle.remove(NotificationCompat.EXTRA_LARGE_ICON_BIG);
            bundle.remove(NotificationCompat.EXTRA_PICTURE);
            bundle.remove(NotificationCompat.EXTRA_PICTURE_ICON);
            bundle.remove(NotificationCompat.EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public String getClassName() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void restoreFromCompatExtras(@NonNull Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            if (bundle.containsKey(NotificationCompat.EXTRA_LARGE_ICON_BIG)) {
                this.f33625e = m57798l(bundle.getParcelable(NotificationCompat.EXTRA_LARGE_ICON_BIG));
                this.f33626f = true;
            }
            this.f33624d = getPictureIcon(bundle);
            this.f33628h = bundle.getBoolean(NotificationCompat.EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED);
        }

        @NonNull
        public BigPictureStyle setBigContentTitle(@Nullable CharSequence charSequence) {
            this.f33727a = Builder.limitCharSequenceLength(charSequence);
            return this;
        }

        @NonNull
        @RequiresApi(31)
        public BigPictureStyle setContentDescription(@Nullable CharSequence charSequence) {
            this.f33627g = charSequence;
            return this;
        }

        @NonNull
        public BigPictureStyle setSummaryText(@Nullable CharSequence charSequence) {
            this.f33728b = Builder.limitCharSequenceLength(charSequence);
            this.f33729c = true;
            return this;
        }

        @NonNull
        @RequiresApi(31)
        public BigPictureStyle showBigPictureWhenCollapsed(boolean z) {
            this.f33628h = z;
            return this;
        }

        public BigPictureStyle(@Nullable Builder builder) {
            setBuilder(builder);
        }

        @NonNull
        @RequiresApi(31)
        public BigPictureStyle bigPicture(@Nullable Icon icon) {
            this.f33624d = IconCompat.createFromIcon(icon);
            return this;
        }

        @NonNull
        @RequiresApi(23)
        public BigPictureStyle bigLargeIcon(@Nullable Icon icon) {
            this.f33625e = icon == null ? null : IconCompat.createFromIcon(icon);
            this.f33626f = true;
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public static class BigTextStyle extends Style {

        /* renamed from: d */
        public CharSequence f33629d;

        /* renamed from: androidx.core.app.NotificationCompat$BigTextStyle$a */
        /* loaded from: classes2.dex */
        public static class C3849a {
            @DoNotInline
            /* renamed from: a */
            public static Notification.BigTextStyle m57788a(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.bigText(charSequence);
            }

            @DoNotInline
            /* renamed from: b */
            public static Notification.BigTextStyle m57787b(Notification.Builder builder) {
                return new Notification.BigTextStyle(builder);
            }

            @DoNotInline
            /* renamed from: c */
            public static Notification.BigTextStyle m57786c(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.setBigContentTitle(charSequence);
            }

            @DoNotInline
            /* renamed from: d */
            public static Notification.BigTextStyle m57785d(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.setSummaryText(charSequence);
            }
        }

        public BigTextStyle() {
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void addCompatExtras(@NonNull Bundle bundle) {
            super.addCompatExtras(bundle);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            Notification.BigTextStyle m57788a = C3849a.m57788a(C3849a.m57786c(C3849a.m57787b(notificationBuilderWithBuilderAccessor.getBuilder()), this.f33727a), this.f33629d);
            if (this.f33729c) {
                C3849a.m57785d(m57788a, this.f33728b);
            }
        }

        @NonNull
        public BigTextStyle bigText(@Nullable CharSequence charSequence) {
            this.f33629d = Builder.limitCharSequenceLength(charSequence);
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void clearCompatExtraKeys(@NonNull Bundle bundle) {
            super.clearCompatExtraKeys(bundle);
            bundle.remove(NotificationCompat.EXTRA_BIG_TEXT);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public String getClassName() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void restoreFromCompatExtras(@NonNull Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            this.f33629d = bundle.getCharSequence(NotificationCompat.EXTRA_BIG_TEXT);
        }

        @NonNull
        public BigTextStyle setBigContentTitle(@Nullable CharSequence charSequence) {
            this.f33727a = Builder.limitCharSequenceLength(charSequence);
            return this;
        }

        @NonNull
        public BigTextStyle setSummaryText(@Nullable CharSequence charSequence) {
            this.f33728b = Builder.limitCharSequenceLength(charSequence);
            this.f33729c = true;
            return this;
        }

        public BigTextStyle(@Nullable Builder builder) {
            setBuilder(builder);
        }
    }

    /* loaded from: classes2.dex */
    public static final class BubbleMetadata {

        /* renamed from: a */
        public PendingIntent f33630a;

        /* renamed from: b */
        public PendingIntent f33631b;

        /* renamed from: c */
        public IconCompat f33632c;

        /* renamed from: d */
        public int f33633d;

        /* renamed from: e */
        public int f33634e;

        /* renamed from: f */
        public int f33635f;

        /* renamed from: g */
        public String f33636g;

        /* loaded from: classes2.dex */
        public static final class Builder {

            /* renamed from: a */
            public PendingIntent f33637a;

            /* renamed from: b */
            public IconCompat f33638b;

            /* renamed from: c */
            public int f33639c;

            /* renamed from: d */
            public int f33640d;

            /* renamed from: e */
            public int f33641e;

            /* renamed from: f */
            public PendingIntent f33642f;

            /* renamed from: g */
            public String f33643g;

            @Deprecated
            public Builder() {
            }

            /* renamed from: a */
            public final Builder m57784a(int i, boolean z) {
                if (z) {
                    this.f33641e = i | this.f33641e;
                } else {
                    this.f33641e = (~i) & this.f33641e;
                }
                return this;
            }

            @NonNull
            @SuppressLint({"SyntheticAccessor"})
            public BubbleMetadata build() {
                String str = this.f33643g;
                if (str == null && this.f33637a == null) {
                    throw new NullPointerException("Must supply pending intent or shortcut to bubble");
                }
                if (str == null && this.f33638b == null) {
                    throw new NullPointerException("Must supply an icon or shortcut for the bubble");
                }
                BubbleMetadata bubbleMetadata = new BubbleMetadata(this.f33637a, this.f33642f, this.f33638b, this.f33639c, this.f33640d, this.f33641e, str);
                bubbleMetadata.setFlags(this.f33641e);
                return bubbleMetadata;
            }

            @NonNull
            public Builder setAutoExpandBubble(boolean z) {
                m57784a(1, z);
                return this;
            }

            @NonNull
            public Builder setDeleteIntent(@Nullable PendingIntent pendingIntent) {
                this.f33642f = pendingIntent;
                return this;
            }

            @NonNull
            public Builder setDesiredHeight(@Dimension(unit = 0) int i) {
                this.f33639c = Math.max(i, 0);
                this.f33640d = 0;
                return this;
            }

            @NonNull
            public Builder setDesiredHeightResId(@DimenRes int i) {
                this.f33640d = i;
                this.f33639c = 0;
                return this;
            }

            @NonNull
            public Builder setIcon(@NonNull IconCompat iconCompat) {
                if (this.f33643g == null) {
                    if (iconCompat != null) {
                        this.f33638b = iconCompat;
                        return this;
                    }
                    throw new NullPointerException("Bubbles require non-null icon");
                }
                throw new IllegalStateException("Created as a shortcut bubble, cannot set an Icon. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
            }

            @NonNull
            public Builder setIntent(@NonNull PendingIntent pendingIntent) {
                if (this.f33643g == null) {
                    if (pendingIntent != null) {
                        this.f33637a = pendingIntent;
                        return this;
                    }
                    throw new NullPointerException("Bubble requires non-null pending intent");
                }
                throw new IllegalStateException("Created as a shortcut bubble, cannot set a PendingIntent. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
            }

            @NonNull
            public Builder setSuppressNotification(boolean z) {
                m57784a(2, z);
                return this;
            }

            @RequiresApi(30)
            public Builder(@NonNull String str) {
                if (!TextUtils.isEmpty(str)) {
                    this.f33643g = str;
                    return;
                }
                throw new NullPointerException("Bubble requires a non-null shortcut id");
            }

            public Builder(@NonNull PendingIntent pendingIntent, @NonNull IconCompat iconCompat) {
                if (pendingIntent == null) {
                    throw new NullPointerException("Bubble requires non-null pending intent");
                }
                if (iconCompat != null) {
                    this.f33637a = pendingIntent;
                    this.f33638b = iconCompat;
                    return;
                }
                throw new NullPointerException("Bubbles require non-null icon");
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$BubbleMetadata$a */
        /* loaded from: classes2.dex */
        public static class C3850a {
            @Nullable
            @RequiresApi(29)
            /* renamed from: a */
            public static BubbleMetadata m57783a(@Nullable Notification.BubbleMetadata bubbleMetadata) {
                if (bubbleMetadata == null || bubbleMetadata.getIntent() == null) {
                    return null;
                }
                Builder suppressNotification = new Builder(bubbleMetadata.getIntent(), IconCompat.createFromIcon(bubbleMetadata.getIcon())).setAutoExpandBubble(bubbleMetadata.getAutoExpandBubble()).setDeleteIntent(bubbleMetadata.getDeleteIntent()).setSuppressNotification(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    suppressNotification.setDesiredHeight(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    suppressNotification.setDesiredHeightResId(bubbleMetadata.getDesiredHeightResId());
                }
                return suppressNotification.build();
            }

            @Nullable
            @RequiresApi(29)
            /* renamed from: b */
            public static Notification.BubbleMetadata m57782b(@Nullable BubbleMetadata bubbleMetadata) {
                if (bubbleMetadata == null || bubbleMetadata.getIntent() == null) {
                    return null;
                }
                Notification.BubbleMetadata.Builder suppressNotification = new Notification.BubbleMetadata.Builder().setIcon(bubbleMetadata.getIcon().toIcon()).setIntent(bubbleMetadata.getIntent()).setDeleteIntent(bubbleMetadata.getDeleteIntent()).setAutoExpandBubble(bubbleMetadata.getAutoExpandBubble()).setSuppressNotification(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    suppressNotification.setDesiredHeight(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    suppressNotification.setDesiredHeightResId(bubbleMetadata.getDesiredHeightResId());
                }
                return suppressNotification.build();
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$BubbleMetadata$b */
        /* loaded from: classes2.dex */
        public static class C3851b {
            @Nullable
            @RequiresApi(30)
            /* renamed from: a */
            public static BubbleMetadata m57781a(@Nullable Notification.BubbleMetadata bubbleMetadata) {
                Builder builder;
                if (bubbleMetadata == null) {
                    return null;
                }
                if (bubbleMetadata.getShortcutId() != null) {
                    builder = new Builder(bubbleMetadata.getShortcutId());
                } else {
                    builder = new Builder(bubbleMetadata.getIntent(), IconCompat.createFromIcon(bubbleMetadata.getIcon()));
                }
                builder.setAutoExpandBubble(bubbleMetadata.getAutoExpandBubble()).setDeleteIntent(bubbleMetadata.getDeleteIntent()).setSuppressNotification(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    builder.setDesiredHeight(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    builder.setDesiredHeightResId(bubbleMetadata.getDesiredHeightResId());
                }
                return builder.build();
            }

            @Nullable
            @RequiresApi(30)
            /* renamed from: b */
            public static Notification.BubbleMetadata m57780b(@Nullable BubbleMetadata bubbleMetadata) {
                Notification.BubbleMetadata.Builder builder;
                if (bubbleMetadata == null) {
                    return null;
                }
                if (bubbleMetadata.getShortcutId() != null) {
                    builder = new Notification.BubbleMetadata.Builder(bubbleMetadata.getShortcutId());
                } else {
                    builder = new Notification.BubbleMetadata.Builder(bubbleMetadata.getIntent(), bubbleMetadata.getIcon().toIcon());
                }
                builder.setDeleteIntent(bubbleMetadata.getDeleteIntent()).setAutoExpandBubble(bubbleMetadata.getAutoExpandBubble()).setSuppressNotification(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    builder.setDesiredHeight(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    builder.setDesiredHeightResId(bubbleMetadata.getDesiredHeightResId());
                }
                return builder.build();
            }
        }

        @Nullable
        public static BubbleMetadata fromPlatform(@Nullable Notification.BubbleMetadata bubbleMetadata) {
            if (bubbleMetadata == null) {
                return null;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                return C3851b.m57781a(bubbleMetadata);
            }
            if (i != 29) {
                return null;
            }
            return C3850a.m57783a(bubbleMetadata);
        }

        @Nullable
        public static Notification.BubbleMetadata toPlatform(@Nullable BubbleMetadata bubbleMetadata) {
            if (bubbleMetadata == null) {
                return null;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                return C3851b.m57780b(bubbleMetadata);
            }
            if (i != 29) {
                return null;
            }
            return C3850a.m57782b(bubbleMetadata);
        }

        public boolean getAutoExpandBubble() {
            if ((this.f33635f & 1) != 0) {
                return true;
            }
            return false;
        }

        @Nullable
        public PendingIntent getDeleteIntent() {
            return this.f33631b;
        }

        @Dimension(unit = 0)
        public int getDesiredHeight() {
            return this.f33633d;
        }

        @DimenRes
        public int getDesiredHeightResId() {
            return this.f33634e;
        }

        @Nullable
        @SuppressLint({"InvalidNullConversion"})
        public IconCompat getIcon() {
            return this.f33632c;
        }

        @Nullable
        @SuppressLint({"InvalidNullConversion"})
        public PendingIntent getIntent() {
            return this.f33630a;
        }

        @Nullable
        public String getShortcutId() {
            return this.f33636g;
        }

        public boolean isNotificationSuppressed() {
            if ((this.f33635f & 2) != 0) {
                return true;
            }
            return false;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void setFlags(int i) {
            this.f33635f = i;
        }

        public BubbleMetadata(PendingIntent pendingIntent, PendingIntent pendingIntent2, IconCompat iconCompat, int i, int i2, int i3, String str) {
            this.f33630a = pendingIntent;
            this.f33632c = iconCompat;
            this.f33633d = i;
            this.f33634e = i2;
            this.f33631b = pendingIntent2;
            this.f33635f = i3;
            this.f33636g = str;
        }
    }

    /* loaded from: classes2.dex */
    public static class Builder {

        /* renamed from: A */
        public String f33644A;

        /* renamed from: B */
        public Bundle f33645B;

        /* renamed from: C */
        public int f33646C;

        /* renamed from: D */
        public int f33647D;

        /* renamed from: E */
        public Notification f33648E;

        /* renamed from: F */
        public RemoteViews f33649F;

        /* renamed from: G */
        public RemoteViews f33650G;

        /* renamed from: H */
        public RemoteViews f33651H;

        /* renamed from: I */
        public String f33652I;

        /* renamed from: J */
        public int f33653J;

        /* renamed from: K */
        public String f33654K;

        /* renamed from: L */
        public LocusIdCompat f33655L;

        /* renamed from: M */
        public long f33656M;

        /* renamed from: N */
        public int f33657N;

        /* renamed from: O */
        public int f33658O;

        /* renamed from: P */
        public boolean f33659P;

        /* renamed from: Q */
        public BubbleMetadata f33660Q;

        /* renamed from: R */
        public Notification f33661R;

        /* renamed from: S */
        public boolean f33662S;

        /* renamed from: T */
        public Object f33663T;

        /* renamed from: a */
        public ArrayList f33664a;

        /* renamed from: b */
        public CharSequence f33665b;

        /* renamed from: c */
        public CharSequence f33666c;

        /* renamed from: d */
        public PendingIntent f33667d;

        /* renamed from: e */
        public PendingIntent f33668e;

        /* renamed from: f */
        public RemoteViews f33669f;

        /* renamed from: g */
        public Bitmap f33670g;

        /* renamed from: h */
        public CharSequence f33671h;

        /* renamed from: i */
        public int f33672i;

        /* renamed from: j */
        public int f33673j;

        /* renamed from: k */
        public boolean f33674k;

        /* renamed from: l */
        public boolean f33675l;

        /* renamed from: m */
        public boolean f33676m;
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public ArrayList<Action> mActions;
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public Context mContext;
        @Deprecated
        public ArrayList<String> mPeople;
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public ArrayList<Person> mPersonList;

        /* renamed from: n */
        public Style f33677n;

        /* renamed from: o */
        public CharSequence f33678o;

        /* renamed from: p */
        public CharSequence f33679p;

        /* renamed from: q */
        public CharSequence[] f33680q;

        /* renamed from: r */
        public int f33681r;

        /* renamed from: s */
        public int f33682s;

        /* renamed from: t */
        public boolean f33683t;

        /* renamed from: u */
        public String f33684u;

        /* renamed from: v */
        public boolean f33685v;

        /* renamed from: w */
        public String f33686w;

        /* renamed from: x */
        public boolean f33687x;

        /* renamed from: y */
        public boolean f33688y;

        /* renamed from: z */
        public boolean f33689z;

        /* renamed from: androidx.core.app.NotificationCompat$Builder$a */
        /* loaded from: classes2.dex */
        public static class C3852a {
            @DoNotInline
            /* renamed from: a */
            public static AudioAttributes m57775a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            @DoNotInline
            /* renamed from: b */
            public static AudioAttributes.Builder m57774b() {
                return new AudioAttributes.Builder();
            }

            @DoNotInline
            /* renamed from: c */
            public static AudioAttributes.Builder m57773c(AudioAttributes.Builder builder, int i) {
                return builder.setContentType(i);
            }

            @DoNotInline
            /* renamed from: d */
            public static AudioAttributes.Builder m57772d(AudioAttributes.Builder builder, int i) {
                return builder.setLegacyStreamType(i);
            }

            @DoNotInline
            /* renamed from: e */
            public static AudioAttributes.Builder m57771e(AudioAttributes.Builder builder, int i) {
                return builder.setUsage(i);
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$Builder$b */
        /* loaded from: classes2.dex */
        public static class C3853b {
            @DoNotInline
            /* renamed from: a */
            public static Icon m57770a(Notification notification) {
                return notification.getSmallIcon();
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$Builder$c */
        /* loaded from: classes2.dex */
        public static class C3854c {
            @DoNotInline
            /* renamed from: a */
            public static RemoteViews m57769a(Notification.Builder builder) {
                return builder.createHeadsUpContentView();
            }

            @DoNotInline
            /* renamed from: b */
            public static RemoteViews m57768b(Notification.Builder builder) {
                return builder.createContentView();
            }

            @DoNotInline
            /* renamed from: c */
            public static RemoteViews m57767c(Notification.Builder builder) {
                return builder.createHeadsUpContentView();
            }

            @DoNotInline
            /* renamed from: d */
            public static Notification.Builder m57766d(Context context, Notification notification) {
                return Notification.Builder.recoverBuilder(context, notification);
            }
        }

        @RequiresApi(19)
        public Builder(@NonNull Context context, @NonNull Notification notification) {
            this(context, NotificationCompat.getChannelId(notification));
            ArrayList parcelableArrayList;
            Bundle bundle = notification.extras;
            Style extractStyleFromNotification = Style.extractStyleFromNotification(notification);
            setContentTitle(NotificationCompat.getContentTitle(notification)).setContentText(NotificationCompat.getContentText(notification)).setContentInfo(NotificationCompat.getContentInfo(notification)).setSubText(NotificationCompat.getSubText(notification)).setSettingsText(NotificationCompat.getSettingsText(notification)).setStyle(extractStyleFromNotification).setContentIntent(notification.contentIntent).setGroup(NotificationCompat.getGroup(notification)).setGroupSummary(NotificationCompat.isGroupSummary(notification)).setLocusId(NotificationCompat.getLocusId(notification)).setWhen(notification.when).setShowWhen(NotificationCompat.getShowWhen(notification)).setUsesChronometer(NotificationCompat.getUsesChronometer(notification)).setAutoCancel(NotificationCompat.getAutoCancel(notification)).setOnlyAlertOnce(NotificationCompat.getOnlyAlertOnce(notification)).setOngoing(NotificationCompat.getOngoing(notification)).setLocalOnly(NotificationCompat.getLocalOnly(notification)).setLargeIcon(notification.largeIcon).setBadgeIconType(NotificationCompat.getBadgeIconType(notification)).setCategory(NotificationCompat.getCategory(notification)).setBubbleMetadata(NotificationCompat.getBubbleMetadata(notification)).setNumber(notification.number).setTicker(notification.tickerText).setContentIntent(notification.contentIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(notification.fullScreenIntent, NotificationCompat.m57808b(notification)).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setDefaults(notification.defaults).setPriority(notification.priority).setColor(NotificationCompat.getColor(notification)).setVisibility(NotificationCompat.getVisibility(notification)).setPublicVersion(NotificationCompat.getPublicVersion(notification)).setSortKey(NotificationCompat.getSortKey(notification)).setTimeoutAfter(NotificationCompat.getTimeoutAfter(notification)).setShortcutId(NotificationCompat.getShortcutId(notification)).setProgress(bundle.getInt(NotificationCompat.EXTRA_PROGRESS_MAX), bundle.getInt(NotificationCompat.EXTRA_PROGRESS), bundle.getBoolean(NotificationCompat.EXTRA_PROGRESS_INDETERMINATE)).setAllowSystemGeneratedContextualActions(NotificationCompat.getAllowSystemGeneratedContextualActions(notification)).setSmallIcon(notification.icon, notification.iconLevel).addExtras(m57779a(notification, extractStyleFromNotification));
            if (Build.VERSION.SDK_INT >= 23) {
                this.f33663T = C3853b.m57770a(notification);
            }
            Notification.Action[] actionArr = notification.actions;
            if (actionArr != null && actionArr.length != 0) {
                for (Notification.Action action : actionArr) {
                    addAction(Action.Builder.fromAndroidAction(action).build());
                }
            }
            List<Action> invisibleActions = NotificationCompat.getInvisibleActions(notification);
            if (!invisibleActions.isEmpty()) {
                for (Action action2 : invisibleActions) {
                    addInvisibleAction(action2);
                }
            }
            String[] stringArray = notification.extras.getStringArray(NotificationCompat.EXTRA_PEOPLE);
            if (stringArray != null && stringArray.length != 0) {
                for (String str : stringArray) {
                    addPerson(str);
                }
            }
            if (Build.VERSION.SDK_INT >= 28 && (parcelableArrayList = notification.extras.getParcelableArrayList(NotificationCompat.EXTRA_PEOPLE_LIST)) != null && !parcelableArrayList.isEmpty()) {
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    addPerson(Person.fromAndroidPerson(AbstractC19380cJ0.m51706a(it.next())));
                }
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 24 && bundle.containsKey(NotificationCompat.EXTRA_CHRONOMETER_COUNT_DOWN)) {
                setChronometerCountDown(bundle.getBoolean(NotificationCompat.EXTRA_CHRONOMETER_COUNT_DOWN));
            }
            if (i < 26 || !bundle.containsKey(NotificationCompat.EXTRA_COLORIZED)) {
                return;
            }
            setColorized(bundle.getBoolean(NotificationCompat.EXTRA_COLORIZED));
        }

        /* renamed from: a */
        public static Bundle m57779a(Notification notification, Style style) {
            if (notification.extras == null) {
                return null;
            }
            Bundle bundle = new Bundle(notification.extras);
            bundle.remove(NotificationCompat.EXTRA_TITLE);
            bundle.remove(NotificationCompat.EXTRA_TEXT);
            bundle.remove(NotificationCompat.EXTRA_INFO_TEXT);
            bundle.remove(NotificationCompat.EXTRA_SUB_TEXT);
            bundle.remove(NotificationCompat.EXTRA_CHANNEL_ID);
            bundle.remove(NotificationCompat.EXTRA_CHANNEL_GROUP_ID);
            bundle.remove(NotificationCompat.EXTRA_SHOW_WHEN);
            bundle.remove(NotificationCompat.EXTRA_PROGRESS);
            bundle.remove(NotificationCompat.EXTRA_PROGRESS_MAX);
            bundle.remove(NotificationCompat.EXTRA_PROGRESS_INDETERMINATE);
            bundle.remove(NotificationCompat.EXTRA_CHRONOMETER_COUNT_DOWN);
            bundle.remove(NotificationCompat.EXTRA_COLORIZED);
            bundle.remove(NotificationCompat.EXTRA_PEOPLE_LIST);
            bundle.remove(NotificationCompat.EXTRA_PEOPLE);
            bundle.remove(NotificationCompatExtras.EXTRA_SORT_KEY);
            bundle.remove(NotificationCompatExtras.EXTRA_GROUP_KEY);
            bundle.remove(NotificationCompatExtras.EXTRA_GROUP_SUMMARY);
            bundle.remove(NotificationCompatExtras.EXTRA_LOCAL_ONLY);
            bundle.remove(NotificationCompatExtras.EXTRA_ACTION_EXTRAS);
            Bundle bundle2 = bundle.getBundle("android.car.EXTENSIONS");
            if (bundle2 != null) {
                Bundle bundle3 = new Bundle(bundle2);
                bundle3.remove("invisible_actions");
                bundle.putBundle("android.car.EXTENSIONS", bundle3);
            }
            if (style != null) {
                style.clearCompatExtraKeys(bundle);
            }
            return bundle;
        }

        @Nullable
        public static CharSequence limitCharSequenceLength(@Nullable CharSequence charSequence) {
            if (charSequence == null) {
                return charSequence;
            }
            if (charSequence.length() > 5120) {
                return charSequence.subSequence(0, 5120);
            }
            return charSequence;
        }

        @NonNull
        public Builder addAction(int i, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent) {
            this.mActions.add(new Action(i, charSequence, pendingIntent));
            return this;
        }

        @NonNull
        public Builder addExtras(@Nullable Bundle bundle) {
            if (bundle != null) {
                Bundle bundle2 = this.f33645B;
                if (bundle2 == null) {
                    this.f33645B = new Bundle(bundle);
                } else {
                    bundle2.putAll(bundle);
                }
            }
            return this;
        }

        @NonNull
        @RequiresApi(21)
        public Builder addInvisibleAction(int i, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent) {
            this.f33664a.add(new Action(i, charSequence, pendingIntent));
            return this;
        }

        @NonNull
        @Deprecated
        public Builder addPerson(@Nullable String str) {
            if (str != null && !str.isEmpty()) {
                this.mPeople.add(str);
            }
            return this;
        }

        /* renamed from: b */
        public final Bitmap m57778b(Bitmap bitmap) {
            if (bitmap != null && Build.VERSION.SDK_INT < 27) {
                Resources resources = this.mContext.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                    return bitmap;
                }
                double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
            }
            return bitmap;
        }

        @NonNull
        public Notification build() {
            return new C3911a(this).m57566b();
        }

        /* renamed from: c */
        public final void m57777c(int i, boolean z) {
            if (z) {
                Notification notification = this.f33661R;
                notification.flags = i | notification.flags;
                return;
            }
            Notification notification2 = this.f33661R;
            notification2.flags = (~i) & notification2.flags;
        }

        @NonNull
        public Builder clearActions() {
            this.mActions.clear();
            return this;
        }

        @NonNull
        public Builder clearInvisibleActions() {
            this.f33664a.clear();
            Bundle bundle = this.f33645B.getBundle("android.car.EXTENSIONS");
            if (bundle != null) {
                Bundle bundle2 = new Bundle(bundle);
                bundle2.remove("invisible_actions");
                this.f33645B.putBundle("android.car.EXTENSIONS", bundle2);
            }
            return this;
        }

        @NonNull
        public Builder clearPeople() {
            this.mPersonList.clear();
            this.mPeople.clear();
            return this;
        }

        @Nullable
        @SuppressLint({"BuilderSetStyle"})
        public RemoteViews createBigContentView() {
            RemoteViews makeBigContentView;
            int i = Build.VERSION.SDK_INT;
            if (this.f33650G != null && m57776d()) {
                return this.f33650G;
            }
            C3911a c3911a = new C3911a(this);
            Style style = this.f33677n;
            if (style != null && (makeBigContentView = style.makeBigContentView(c3911a)) != null) {
                return makeBigContentView;
            }
            Notification m57566b = c3911a.m57566b();
            if (i >= 24) {
                return C3854c.m57769a(C3854c.m57766d(this.mContext, m57566b));
            }
            return m57566b.bigContentView;
        }

        @Nullable
        @SuppressLint({"BuilderSetStyle"})
        public RemoteViews createContentView() {
            RemoteViews makeContentView;
            if (this.f33649F != null && m57776d()) {
                return this.f33649F;
            }
            C3911a c3911a = new C3911a(this);
            Style style = this.f33677n;
            if (style != null && (makeContentView = style.makeContentView(c3911a)) != null) {
                return makeContentView;
            }
            Notification m57566b = c3911a.m57566b();
            if (Build.VERSION.SDK_INT >= 24) {
                return C3854c.m57768b(C3854c.m57766d(this.mContext, m57566b));
            }
            return m57566b.contentView;
        }

        @Nullable
        @SuppressLint({"BuilderSetStyle"})
        public RemoteViews createHeadsUpContentView() {
            RemoteViews makeHeadsUpContentView;
            int i = Build.VERSION.SDK_INT;
            if (this.f33651H != null && m57776d()) {
                return this.f33651H;
            }
            C3911a c3911a = new C3911a(this);
            Style style = this.f33677n;
            if (style != null && (makeHeadsUpContentView = style.makeHeadsUpContentView(c3911a)) != null) {
                return makeHeadsUpContentView;
            }
            Notification m57566b = c3911a.m57566b();
            if (i >= 24) {
                return C3854c.m57767c(C3854c.m57766d(this.mContext, m57566b));
            }
            return m57566b.headsUpContentView;
        }

        /* renamed from: d */
        public final boolean m57776d() {
            Style style = this.f33677n;
            if (style != null && style.displayCustomViewInline()) {
                return false;
            }
            return true;
        }

        @NonNull
        public Builder extend(@NonNull Extender extender) {
            extender.extend(this);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews getBigContentView() {
            return this.f33650G;
        }

        @Nullable
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public BubbleMetadata getBubbleMetadata() {
            return this.f33660Q;
        }

        @ColorInt
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public int getColor() {
            return this.f33646C;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews getContentView() {
            return this.f33649F;
        }

        @NonNull
        public Bundle getExtras() {
            if (this.f33645B == null) {
                this.f33645B = new Bundle();
            }
            return this.f33645B;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public int getForegroundServiceBehavior() {
            return this.f33658O;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews getHeadsUpContentView() {
            return this.f33651H;
        }

        @NonNull
        @Deprecated
        public Notification getNotification() {
            return build();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public int getPriority() {
            return this.f33673j;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public long getWhenIfShowing() {
            if (this.f33674k) {
                return this.f33661R.when;
            }
            return 0L;
        }

        @NonNull
        public Builder setAllowSystemGeneratedContextualActions(boolean z) {
            this.f33659P = z;
            return this;
        }

        @NonNull
        public Builder setAutoCancel(boolean z) {
            m57777c(16, z);
            return this;
        }

        @NonNull
        public Builder setBadgeIconType(int i) {
            this.f33653J = i;
            return this;
        }

        @NonNull
        public Builder setBubbleMetadata(@Nullable BubbleMetadata bubbleMetadata) {
            this.f33660Q = bubbleMetadata;
            return this;
        }

        @NonNull
        public Builder setCategory(@Nullable String str) {
            this.f33644A = str;
            return this;
        }

        @NonNull
        public Builder setChannelId(@NonNull String str) {
            this.f33652I = str;
            return this;
        }

        @NonNull
        @RequiresApi(24)
        public Builder setChronometerCountDown(boolean z) {
            this.f33676m = z;
            getExtras().putBoolean(NotificationCompat.EXTRA_CHRONOMETER_COUNT_DOWN, z);
            return this;
        }

        @NonNull
        public Builder setColor(@ColorInt int i) {
            this.f33646C = i;
            return this;
        }

        @NonNull
        public Builder setColorized(boolean z) {
            this.f33688y = z;
            this.f33689z = true;
            return this;
        }

        @NonNull
        public Builder setContent(@Nullable RemoteViews remoteViews) {
            this.f33661R.contentView = remoteViews;
            return this;
        }

        @NonNull
        public Builder setContentInfo(@Nullable CharSequence charSequence) {
            this.f33671h = limitCharSequenceLength(charSequence);
            return this;
        }

        @NonNull
        public Builder setContentIntent(@Nullable PendingIntent pendingIntent) {
            this.f33667d = pendingIntent;
            return this;
        }

        @NonNull
        public Builder setContentText(@Nullable CharSequence charSequence) {
            this.f33666c = limitCharSequenceLength(charSequence);
            return this;
        }

        @NonNull
        public Builder setContentTitle(@Nullable CharSequence charSequence) {
            this.f33665b = limitCharSequenceLength(charSequence);
            return this;
        }

        @NonNull
        public Builder setCustomBigContentView(@Nullable RemoteViews remoteViews) {
            this.f33650G = remoteViews;
            return this;
        }

        @NonNull
        public Builder setCustomContentView(@Nullable RemoteViews remoteViews) {
            this.f33649F = remoteViews;
            return this;
        }

        @NonNull
        public Builder setCustomHeadsUpContentView(@Nullable RemoteViews remoteViews) {
            this.f33651H = remoteViews;
            return this;
        }

        @NonNull
        public Builder setDefaults(int i) {
            Notification notification = this.f33661R;
            notification.defaults = i;
            if ((i & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        @NonNull
        public Builder setDeleteIntent(@Nullable PendingIntent pendingIntent) {
            this.f33661R.deleteIntent = pendingIntent;
            return this;
        }

        @NonNull
        public Builder setExtras(@Nullable Bundle bundle) {
            this.f33645B = bundle;
            return this;
        }

        @NonNull
        public Builder setForegroundServiceBehavior(int i) {
            this.f33658O = i;
            return this;
        }

        @NonNull
        public Builder setFullScreenIntent(@Nullable PendingIntent pendingIntent, boolean z) {
            this.f33668e = pendingIntent;
            m57777c(128, z);
            return this;
        }

        @NonNull
        public Builder setGroup(@Nullable String str) {
            this.f33684u = str;
            return this;
        }

        @NonNull
        public Builder setGroupAlertBehavior(int i) {
            this.f33657N = i;
            return this;
        }

        @NonNull
        public Builder setGroupSummary(boolean z) {
            this.f33685v = z;
            return this;
        }

        @NonNull
        public Builder setLargeIcon(@Nullable Bitmap bitmap) {
            this.f33670g = m57778b(bitmap);
            return this;
        }

        @NonNull
        public Builder setLights(@ColorInt int i, int i2, int i3) {
            int i4;
            Notification notification = this.f33661R;
            notification.ledARGB = i;
            notification.ledOnMS = i2;
            notification.ledOffMS = i3;
            if (i2 != 0 && i3 != 0) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            notification.flags = i4 | (notification.flags & (-2));
            return this;
        }

        @NonNull
        public Builder setLocalOnly(boolean z) {
            this.f33687x = z;
            return this;
        }

        @NonNull
        public Builder setLocusId(@Nullable LocusIdCompat locusIdCompat) {
            this.f33655L = locusIdCompat;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setNotificationSilent() {
            this.f33662S = true;
            return this;
        }

        @NonNull
        public Builder setNumber(int i) {
            this.f33672i = i;
            return this;
        }

        @NonNull
        public Builder setOngoing(boolean z) {
            m57777c(2, z);
            return this;
        }

        @NonNull
        public Builder setOnlyAlertOnce(boolean z) {
            m57777c(8, z);
            return this;
        }

        @NonNull
        public Builder setPriority(int i) {
            this.f33673j = i;
            return this;
        }

        @NonNull
        public Builder setProgress(int i, int i2, boolean z) {
            this.f33681r = i;
            this.f33682s = i2;
            this.f33683t = z;
            return this;
        }

        @NonNull
        public Builder setPublicVersion(@Nullable Notification notification) {
            this.f33648E = notification;
            return this;
        }

        @NonNull
        public Builder setRemoteInputHistory(@Nullable CharSequence[] charSequenceArr) {
            this.f33680q = charSequenceArr;
            return this;
        }

        @NonNull
        public Builder setSettingsText(@Nullable CharSequence charSequence) {
            this.f33679p = limitCharSequenceLength(charSequence);
            return this;
        }

        @NonNull
        public Builder setShortcutId(@Nullable String str) {
            this.f33654K = str;
            return this;
        }

        @NonNull
        public Builder setShortcutInfo(@Nullable ShortcutInfoCompat shortcutInfoCompat) {
            if (shortcutInfoCompat == null) {
                return this;
            }
            this.f33654K = shortcutInfoCompat.getId();
            if (this.f33655L == null) {
                if (shortcutInfoCompat.getLocusId() != null) {
                    this.f33655L = shortcutInfoCompat.getLocusId();
                } else if (shortcutInfoCompat.getId() != null) {
                    this.f33655L = new LocusIdCompat(shortcutInfoCompat.getId());
                }
            }
            if (this.f33665b == null) {
                setContentTitle(shortcutInfoCompat.getShortLabel());
            }
            return this;
        }

        @NonNull
        public Builder setShowWhen(boolean z) {
            this.f33674k = z;
            return this;
        }

        @NonNull
        public Builder setSilent(boolean z) {
            this.f33662S = z;
            return this;
        }

        @NonNull
        @RequiresApi(23)
        public Builder setSmallIcon(@NonNull IconCompat iconCompat) {
            this.f33663T = iconCompat.toIcon(this.mContext);
            return this;
        }

        @NonNull
        public Builder setSortKey(@Nullable String str) {
            this.f33686w = str;
            return this;
        }

        @NonNull
        public Builder setSound(@Nullable Uri uri) {
            Notification notification = this.f33661R;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder m57771e = C3852a.m57771e(C3852a.m57773c(C3852a.m57774b(), 4), 5);
            this.f33661R.audioAttributes = C3852a.m57775a(m57771e);
            return this;
        }

        @NonNull
        public Builder setStyle(@Nullable Style style) {
            if (this.f33677n != style) {
                this.f33677n = style;
                if (style != null) {
                    style.setBuilder(this);
                }
            }
            return this;
        }

        @NonNull
        public Builder setSubText(@Nullable CharSequence charSequence) {
            this.f33678o = limitCharSequenceLength(charSequence);
            return this;
        }

        @NonNull
        public Builder setTicker(@Nullable CharSequence charSequence) {
            this.f33661R.tickerText = limitCharSequenceLength(charSequence);
            return this;
        }

        @NonNull
        public Builder setTimeoutAfter(long j) {
            this.f33656M = j;
            return this;
        }

        @NonNull
        public Builder setUsesChronometer(boolean z) {
            this.f33675l = z;
            return this;
        }

        @NonNull
        public Builder setVibrate(@Nullable long[] jArr) {
            this.f33661R.vibrate = jArr;
            return this;
        }

        @NonNull
        public Builder setVisibility(int i) {
            this.f33647D = i;
            return this;
        }

        @NonNull
        public Builder setWhen(long j) {
            this.f33661R.when = j;
            return this;
        }

        @NonNull
        public Builder addAction(@Nullable Action action) {
            if (action != null) {
                this.mActions.add(action);
            }
            return this;
        }

        @NonNull
        @RequiresApi(21)
        public Builder addInvisibleAction(@Nullable Action action) {
            if (action != null) {
                this.f33664a.add(action);
            }
            return this;
        }

        @NonNull
        public Builder setSmallIcon(int i) {
            this.f33661R.icon = i;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setTicker(@Nullable CharSequence charSequence, @Nullable RemoteViews remoteViews) {
            this.f33661R.tickerText = limitCharSequenceLength(charSequence);
            this.f33669f = remoteViews;
            return this;
        }

        @NonNull
        public Builder addPerson(@Nullable Person person) {
            if (person != null) {
                this.mPersonList.add(person);
            }
            return this;
        }

        @NonNull
        public Builder setSmallIcon(int i, int i2) {
            Notification notification = this.f33661R;
            notification.icon = i;
            notification.iconLevel = i2;
            return this;
        }

        @NonNull
        public Builder setSound(@Nullable Uri uri, int i) {
            Notification notification = this.f33661R;
            notification.sound = uri;
            notification.audioStreamType = i;
            AudioAttributes.Builder m57772d = C3852a.m57772d(C3852a.m57773c(C3852a.m57774b(), 4), i);
            this.f33661R.audioAttributes = C3852a.m57775a(m57772d);
            return this;
        }

        public Builder(@NonNull Context context, @NonNull String str) {
            this.mActions = new ArrayList<>();
            this.mPersonList = new ArrayList<>();
            this.f33664a = new ArrayList();
            this.f33674k = true;
            this.f33687x = false;
            this.f33646C = 0;
            this.f33647D = 0;
            this.f33653J = 0;
            this.f33657N = 0;
            this.f33658O = 0;
            Notification notification = new Notification();
            this.f33661R = notification;
            this.mContext = context;
            this.f33652I = str;
            notification.when = System.currentTimeMillis();
            this.f33661R.audioStreamType = -1;
            this.f33673j = 0;
            this.mPeople = new ArrayList<>();
            this.f33659P = true;
        }

        @Deprecated
        public Builder(@NonNull Context context) {
            this(context, (String) null);
        }
    }

    /* loaded from: classes2.dex */
    public static class CallStyle extends Style {
        public static final int CALL_TYPE_INCOMING = 1;
        public static final int CALL_TYPE_ONGOING = 2;
        public static final int CALL_TYPE_SCREENING = 3;
        public static final int CALL_TYPE_UNKNOWN = 0;

        /* renamed from: d */
        public int f33690d;

        /* renamed from: e */
        public Person f33691e;

        /* renamed from: f */
        public PendingIntent f33692f;

        /* renamed from: g */
        public PendingIntent f33693g;

        /* renamed from: h */
        public PendingIntent f33694h;

        /* renamed from: i */
        public boolean f33695i;

        /* renamed from: j */
        public Integer f33696j;

        /* renamed from: k */
        public Integer f33697k;

        /* renamed from: l */
        public IconCompat f33698l;

        /* renamed from: m */
        public CharSequence f33699m;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* loaded from: classes2.dex */
        public @interface CallType {
        }

        /* renamed from: androidx.core.app.NotificationCompat$CallStyle$a */
        /* loaded from: classes2.dex */
        public static class C3855a {
            @DoNotInline
            /* renamed from: a */
            public static void m57759a(Notification.CallStyle callStyle, Notification.Builder builder) {
                callStyle.setBuilder(builder);
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$CallStyle$b */
        /* loaded from: classes2.dex */
        public static class C3856b {
            @DoNotInline
            /* renamed from: a */
            public static Notification.Builder m57758a(Notification.Builder builder, Notification.Action action) {
                return builder.addAction(action);
            }

            @DoNotInline
            /* renamed from: b */
            public static Notification.Action.Builder m57757b(Notification.Action.Builder builder, Bundle bundle) {
                return builder.addExtras(bundle);
            }

            @DoNotInline
            /* renamed from: c */
            public static Notification.Action.Builder m57756c(Notification.Action.Builder builder, android.app.RemoteInput remoteInput) {
                return builder.addRemoteInput(remoteInput);
            }

            @DoNotInline
            /* renamed from: d */
            public static Notification.Action m57755d(Notification.Action.Builder builder) {
                return builder.build();
            }

            @DoNotInline
            /* renamed from: e */
            public static Notification.Action.Builder m57754e(int i, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(i, charSequence, pendingIntent);
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$CallStyle$c */
        /* loaded from: classes2.dex */
        public static class C3857c {
            @DoNotInline
            /* renamed from: a */
            public static Notification.Builder m57753a(Notification.Builder builder, String str) {
                return builder.addPerson(str);
            }

            @DoNotInline
            /* renamed from: b */
            public static Notification.Builder m57752b(Notification.Builder builder, String str) {
                return builder.setCategory(str);
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$CallStyle$d */
        /* loaded from: classes2.dex */
        public static class C3858d {
            @DoNotInline
            /* renamed from: a */
            public static Notification.Action.Builder m57751a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(icon, charSequence, pendingIntent);
            }

            @DoNotInline
            /* renamed from: b */
            public static void m57750b(Notification.Builder builder, Icon icon) {
                builder.setLargeIcon(icon);
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$CallStyle$e */
        /* loaded from: classes2.dex */
        public static class C3859e {
            @DoNotInline
            /* renamed from: a */
            public static Notification.Builder m57749a(Notification.Builder builder) {
                return builder.setActions(new Notification.Action[0]);
            }

            @DoNotInline
            /* renamed from: b */
            public static Notification.Action.Builder m57748b(Notification.Action.Builder builder, boolean z) {
                return builder.setAllowGeneratedReplies(z);
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$CallStyle$f */
        /* loaded from: classes2.dex */
        public static class C3860f {
            @DoNotInline
            /* renamed from: a */
            public static Notification.Builder m57747a(Notification.Builder builder, android.app.Person person) {
                return builder.addPerson(person);
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$CallStyle$g */
        /* loaded from: classes2.dex */
        public static class C3861g {
            @DoNotInline
            /* renamed from: a */
            public static Notification.CallStyle m57746a(@NonNull android.app.Person person, @NonNull PendingIntent pendingIntent, @NonNull PendingIntent pendingIntent2) {
                return Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
            }

            @DoNotInline
            /* renamed from: b */
            public static Notification.CallStyle m57745b(@NonNull android.app.Person person, @NonNull PendingIntent pendingIntent) {
                return Notification.CallStyle.forOngoingCall(person, pendingIntent);
            }

            @DoNotInline
            /* renamed from: c */
            public static Notification.CallStyle m57744c(@NonNull android.app.Person person, @NonNull PendingIntent pendingIntent, @NonNull PendingIntent pendingIntent2) {
                return Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
            }

            @DoNotInline
            /* renamed from: d */
            public static Notification.CallStyle m57743d(Notification.CallStyle callStyle, @ColorInt int i) {
                return callStyle.setAnswerButtonColorHint(i);
            }

            @DoNotInline
            /* renamed from: e */
            public static Notification.Action.Builder m57742e(Notification.Action.Builder builder, boolean z) {
                return builder.setAuthenticationRequired(z);
            }

            @DoNotInline
            /* renamed from: f */
            public static Notification.CallStyle m57741f(Notification.CallStyle callStyle, @ColorInt int i) {
                return callStyle.setDeclineButtonColorHint(i);
            }

            @DoNotInline
            /* renamed from: g */
            public static Notification.CallStyle m57740g(Notification.CallStyle callStyle, boolean z) {
                return callStyle.setIsVideo(z);
            }

            @DoNotInline
            /* renamed from: h */
            public static Notification.CallStyle m57739h(Notification.CallStyle callStyle, @Nullable Icon icon) {
                return callStyle.setVerificationIcon(icon);
            }

            @DoNotInline
            /* renamed from: i */
            public static Notification.CallStyle m57738i(Notification.CallStyle callStyle, @Nullable CharSequence charSequence) {
                return callStyle.setVerificationText(charSequence);
            }
        }

        public CallStyle() {
        }

        @NonNull
        public static CallStyle forIncomingCall(@NonNull Person person, @NonNull PendingIntent pendingIntent, @NonNull PendingIntent pendingIntent2) {
            Objects.requireNonNull(pendingIntent, "declineIntent is required");
            Objects.requireNonNull(pendingIntent2, "answerIntent is required");
            return new CallStyle(1, person, null, pendingIntent, pendingIntent2);
        }

        @NonNull
        public static CallStyle forOngoingCall(@NonNull Person person, @NonNull PendingIntent pendingIntent) {
            Objects.requireNonNull(pendingIntent, "hangUpIntent is required");
            return new CallStyle(2, person, pendingIntent, null, null);
        }

        @NonNull
        public static CallStyle forScreeningCall(@NonNull Person person, @NonNull PendingIntent pendingIntent, @NonNull PendingIntent pendingIntent2) {
            Objects.requireNonNull(pendingIntent, "hangUpIntent is required");
            Objects.requireNonNull(pendingIntent2, "answerIntent is required");
            return new CallStyle(3, person, pendingIntent, null, pendingIntent2);
        }

        /* renamed from: l */
        public static Notification.Action m57765l(Action action) {
            int i;
            Notification.Action.Builder m57754e;
            Bundle bundle;
            Icon icon;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 23) {
                IconCompat iconCompat = action.getIconCompat();
                if (iconCompat == null) {
                    icon = null;
                } else {
                    icon = iconCompat.toIcon();
                }
                m57754e = C3858d.m57751a(icon, action.getTitle(), action.getActionIntent());
            } else {
                IconCompat iconCompat2 = action.getIconCompat();
                if (iconCompat2 != null && iconCompat2.getType() == 2) {
                    i = iconCompat2.getResId();
                } else {
                    i = 0;
                }
                m57754e = C3856b.m57754e(i, action.getTitle(), action.getActionIntent());
            }
            if (action.getExtras() != null) {
                bundle = new Bundle(action.getExtras());
            } else {
                bundle = new Bundle();
            }
            bundle.putBoolean("android.support.allowGeneratedReplies", action.getAllowGeneratedReplies());
            if (i2 >= 24) {
                C3859e.m57748b(m57754e, action.getAllowGeneratedReplies());
            }
            if (i2 >= 31) {
                C3861g.m57742e(m57754e, action.isAuthenticationRequired());
            }
            C3856b.m57757b(m57754e, bundle);
            RemoteInput[] remoteInputs = action.getRemoteInputs();
            if (remoteInputs != null) {
                for (android.app.RemoteInput remoteInput : RemoteInput.m57596b(remoteInputs)) {
                    C3856b.m57756c(m57754e, remoteInput);
                }
            }
            return C3856b.m57755d(m57754e);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void addCompatExtras(@NonNull Bundle bundle) {
            super.addCompatExtras(bundle);
            bundle.putInt(NotificationCompat.EXTRA_CALL_TYPE, this.f33690d);
            bundle.putBoolean(NotificationCompat.EXTRA_CALL_IS_VIDEO, this.f33695i);
            Person person = this.f33691e;
            if (person != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable(NotificationCompat.EXTRA_CALL_PERSON, person.toAndroidPerson());
                } else {
                    bundle.putParcelable(NotificationCompat.EXTRA_CALL_PERSON_COMPAT, person.toBundle());
                }
            }
            IconCompat iconCompat = this.f33698l;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 23) {
                    bundle.putParcelable(NotificationCompat.EXTRA_VERIFICATION_ICON, iconCompat.toIcon(this.mBuilder.mContext));
                } else {
                    bundle.putParcelable(NotificationCompat.EXTRA_VERIFICATION_ICON_COMPAT, iconCompat.toBundle());
                }
            }
            bundle.putCharSequence(NotificationCompat.EXTRA_VERIFICATION_TEXT, this.f33699m);
            bundle.putParcelable(NotificationCompat.EXTRA_ANSWER_INTENT, this.f33692f);
            bundle.putParcelable(NotificationCompat.EXTRA_DECLINE_INTENT, this.f33693g);
            bundle.putParcelable(NotificationCompat.EXTRA_HANG_UP_INTENT, this.f33694h);
            Integer num = this.f33696j;
            if (num != null) {
                bundle.putInt(NotificationCompat.EXTRA_ANSWER_COLOR, num.intValue());
            }
            Integer num2 = this.f33697k;
            if (num2 != null) {
                bundle.putInt(NotificationCompat.EXTRA_DECLINE_COLOR, num2.intValue());
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            CharSequence charSequence;
            int i = Build.VERSION.SDK_INT;
            CharSequence charSequence2 = null;
            r2 = null;
            Notification.CallStyle m57746a = null;
            charSequence2 = null;
            if (i >= 31) {
                int i2 = this.f33690d;
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (Log.isLoggable("NotifCompat", 3)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Unrecognized call type in CallStyle: ");
                                sb.append(String.valueOf(this.f33690d));
                            }
                        } else {
                            m57746a = C3861g.m57744c(this.f33691e.toAndroidPerson(), this.f33694h, this.f33692f);
                        }
                    } else {
                        m57746a = C3861g.m57745b(this.f33691e.toAndroidPerson(), this.f33694h);
                    }
                } else {
                    m57746a = C3861g.m57746a(this.f33691e.toAndroidPerson(), this.f33693g, this.f33692f);
                }
                if (m57746a != null) {
                    C3859e.m57749a(notificationBuilderWithBuilderAccessor.getBuilder());
                    C3855a.m57759a(m57746a, notificationBuilderWithBuilderAccessor.getBuilder());
                    Integer num = this.f33696j;
                    if (num != null) {
                        C3861g.m57743d(m57746a, num.intValue());
                    }
                    Integer num2 = this.f33697k;
                    if (num2 != null) {
                        C3861g.m57741f(m57746a, num2.intValue());
                    }
                    C3861g.m57738i(m57746a, this.f33699m);
                    IconCompat iconCompat = this.f33698l;
                    if (iconCompat != null) {
                        C3861g.m57739h(m57746a, iconCompat.toIcon(this.mBuilder.mContext));
                    }
                    C3861g.m57740g(m57746a, this.f33695i);
                    return;
                }
                return;
            }
            Notification.Builder builder = notificationBuilderWithBuilderAccessor.getBuilder();
            Person person = this.f33691e;
            if (person != null) {
                charSequence = person.getName();
            } else {
                charSequence = null;
            }
            builder.setContentTitle(charSequence);
            Bundle bundle = this.mBuilder.f33645B;
            if (bundle != null && bundle.containsKey(NotificationCompat.EXTRA_TEXT)) {
                charSequence2 = this.mBuilder.f33645B.getCharSequence(NotificationCompat.EXTRA_TEXT);
            }
            if (charSequence2 == null) {
                charSequence2 = m57764m();
            }
            builder.setContentText(charSequence2);
            Person person2 = this.f33691e;
            if (person2 != null) {
                if (i >= 23 && person2.getIcon() != null) {
                    C3858d.m57750b(builder, this.f33691e.getIcon().toIcon(this.mBuilder.mContext));
                }
                if (i >= 28) {
                    C3860f.m57747a(builder, this.f33691e.toAndroidPerson());
                } else {
                    C3857c.m57753a(builder, this.f33691e.getUri());
                }
            }
            ArrayList<Action> actionsListWithSystemActions = getActionsListWithSystemActions();
            if (i >= 24) {
                C3859e.m57749a(builder);
            }
            for (Action action : actionsListWithSystemActions) {
                C3856b.m57758a(builder, m57765l(action));
            }
            C3857c.m57752b(builder, NotificationCompat.CATEGORY_CALL);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public boolean displayCustomViewInline() {
            return true;
        }

        @NonNull
        @RequiresApi(20)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public ArrayList<Action> getActionsListWithSystemActions() {
            Action m57760q = m57760q();
            Action m57761p = m57761p();
            ArrayList<Action> arrayList = new ArrayList<>(3);
            arrayList.add(m57760q);
            ArrayList<Action> arrayList2 = this.mBuilder.mActions;
            int i = 2;
            if (arrayList2 != null) {
                for (Action action : arrayList2) {
                    if (action.isContextual()) {
                        arrayList.add(action);
                    } else if (!m57763n(action) && i > 1) {
                        arrayList.add(action);
                        i--;
                    }
                    if (m57761p != null && i == 1) {
                        arrayList.add(m57761p);
                        i--;
                    }
                }
            }
            if (m57761p != null && i >= 1) {
                arrayList.add(m57761p);
            }
            return arrayList;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public String getClassName() {
            return "androidx.core.app.NotificationCompat$CallStyle";
        }

        /* renamed from: m */
        public final String m57764m() {
            int i = this.f33690d;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return this.mBuilder.mContext.getResources().getString(R.string.call_notification_screening_text);
                }
                return this.mBuilder.mContext.getResources().getString(R.string.call_notification_ongoing_text);
            }
            return this.mBuilder.mContext.getResources().getString(R.string.call_notification_incoming_text);
        }

        /* renamed from: n */
        public final boolean m57763n(Action action) {
            if (action != null && action.getExtras().getBoolean("key_action_priority")) {
                return true;
            }
            return false;
        }

        /* renamed from: o */
        public final Action m57762o(int i, int i2, Integer num, int i3, PendingIntent pendingIntent) {
            if (num == null) {
                num = Integer.valueOf(ContextCompat.getColor(this.mBuilder.mContext, i3));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.mBuilder.mContext.getResources().getString(i2));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
            Action build = new Action.Builder(IconCompat.createWithResource(this.mBuilder.mContext, i), spannableStringBuilder, pendingIntent).build();
            build.getExtras().putBoolean("key_action_priority", true);
            return build;
        }

        /* renamed from: p */
        public final Action m57761p() {
            int i;
            int i2;
            int i3 = R.drawable.ic_call_answer_video;
            int i4 = R.drawable.ic_call_answer;
            PendingIntent pendingIntent = this.f33692f;
            if (pendingIntent == null) {
                return null;
            }
            boolean z = this.f33695i;
            if (z) {
                i = i3;
            } else {
                i = i4;
            }
            if (z) {
                i2 = R.string.call_notification_answer_video_action;
            } else {
                i2 = R.string.call_notification_answer_action;
            }
            return m57762o(i, i2, this.f33696j, R.color.call_notification_answer_color, pendingIntent);
        }

        /* renamed from: q */
        public final Action m57760q() {
            int i = R.drawable.ic_call_decline;
            PendingIntent pendingIntent = this.f33693g;
            if (pendingIntent == null) {
                return m57762o(i, R.string.call_notification_hang_up_action, this.f33697k, R.color.call_notification_decline_color, this.f33694h);
            }
            return m57762o(i, R.string.call_notification_decline_action, this.f33697k, R.color.call_notification_decline_color, pendingIntent);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void restoreFromCompatExtras(@NonNull Bundle bundle) {
            Integer num;
            super.restoreFromCompatExtras(bundle);
            this.f33690d = bundle.getInt(NotificationCompat.EXTRA_CALL_TYPE);
            this.f33695i = bundle.getBoolean(NotificationCompat.EXTRA_CALL_IS_VIDEO);
            int i = Build.VERSION.SDK_INT;
            if (i >= 28 && bundle.containsKey(NotificationCompat.EXTRA_CALL_PERSON)) {
                this.f33691e = Person.fromAndroidPerson(AbstractC19380cJ0.m51706a(bundle.getParcelable(NotificationCompat.EXTRA_CALL_PERSON)));
            } else if (bundle.containsKey(NotificationCompat.EXTRA_CALL_PERSON_COMPAT)) {
                this.f33691e = Person.fromBundle(bundle.getBundle(NotificationCompat.EXTRA_CALL_PERSON_COMPAT));
            }
            if (i >= 23 && bundle.containsKey(NotificationCompat.EXTRA_VERIFICATION_ICON)) {
                this.f33698l = IconCompat.createFromIcon(AbstractC19726eJ0.m31726a(bundle.getParcelable(NotificationCompat.EXTRA_VERIFICATION_ICON)));
            } else if (bundle.containsKey(NotificationCompat.EXTRA_VERIFICATION_ICON_COMPAT)) {
                this.f33698l = IconCompat.createFromBundle(bundle.getBundle(NotificationCompat.EXTRA_VERIFICATION_ICON_COMPAT));
            }
            this.f33699m = bundle.getCharSequence(NotificationCompat.EXTRA_VERIFICATION_TEXT);
            this.f33692f = (PendingIntent) bundle.getParcelable(NotificationCompat.EXTRA_ANSWER_INTENT);
            this.f33693g = (PendingIntent) bundle.getParcelable(NotificationCompat.EXTRA_DECLINE_INTENT);
            this.f33694h = (PendingIntent) bundle.getParcelable(NotificationCompat.EXTRA_HANG_UP_INTENT);
            Integer num2 = null;
            if (bundle.containsKey(NotificationCompat.EXTRA_ANSWER_COLOR)) {
                num = Integer.valueOf(bundle.getInt(NotificationCompat.EXTRA_ANSWER_COLOR));
            } else {
                num = null;
            }
            this.f33696j = num;
            if (bundle.containsKey(NotificationCompat.EXTRA_DECLINE_COLOR)) {
                num2 = Integer.valueOf(bundle.getInt(NotificationCompat.EXTRA_DECLINE_COLOR));
            }
            this.f33697k = num2;
        }

        @NonNull
        public CallStyle setAnswerButtonColorHint(@ColorInt int i) {
            this.f33696j = Integer.valueOf(i);
            return this;
        }

        @NonNull
        public CallStyle setDeclineButtonColorHint(@ColorInt int i) {
            this.f33697k = Integer.valueOf(i);
            return this;
        }

        @NonNull
        public CallStyle setIsVideo(boolean z) {
            this.f33695i = z;
            return this;
        }

        @NonNull
        @RequiresApi(23)
        public CallStyle setVerificationIcon(@Nullable Icon icon) {
            this.f33698l = icon == null ? null : IconCompat.createFromIcon(icon);
            return this;
        }

        @NonNull
        public CallStyle setVerificationText(@Nullable CharSequence charSequence) {
            this.f33699m = charSequence;
            return this;
        }

        public CallStyle(@Nullable Builder builder) {
            setBuilder(builder);
        }

        @NonNull
        public CallStyle setVerificationIcon(@Nullable Bitmap bitmap) {
            this.f33698l = IconCompat.createWithBitmap(bitmap);
            return this;
        }

        public CallStyle(int i, Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3) {
            if (person != null && !TextUtils.isEmpty(person.getName())) {
                this.f33690d = i;
                this.f33691e = person;
                this.f33692f = pendingIntent3;
                this.f33693g = pendingIntent2;
                this.f33694h = pendingIntent;
                return;
            }
            throw new IllegalArgumentException("person must have a non-empty a name");
        }
    }

    /* loaded from: classes2.dex */
    public static class DecoratedCustomViewStyle extends Style {

        /* renamed from: androidx.core.app.NotificationCompat$DecoratedCustomViewStyle$a */
        /* loaded from: classes2.dex */
        public static class C3864a {
            @DoNotInline
            /* renamed from: a */
            public static void m57720a(RemoteViews remoteViews, int i, CharSequence charSequence) {
                remoteViews.setContentDescription(i, charSequence);
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$DecoratedCustomViewStyle$b */
        /* loaded from: classes2.dex */
        public static class C3865b {
            @DoNotInline
            /* renamed from: a */
            public static Notification.Builder m57719a(Notification.Builder builder, Object obj) {
                return builder.setStyle((Notification.Style) obj);
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$DecoratedCustomViewStyle$c */
        /* loaded from: classes2.dex */
        public static class C3866c {
            @DoNotInline
            /* renamed from: a */
            public static Notification.DecoratedCustomViewStyle m57718a() {
                return new Notification.DecoratedCustomViewStyle();
            }
        }

        /* renamed from: n */
        public static List m57721n(List list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Action action = (Action) it.next();
                if (!action.isContextual()) {
                    arrayList.add(action);
                }
            }
            return arrayList;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            if (Build.VERSION.SDK_INT >= 24) {
                C3865b.m57719a(notificationBuilderWithBuilderAccessor.getBuilder(), C3866c.m57718a());
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public boolean displayCustomViewInline() {
            return true;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public String getClassName() {
            return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
        }

        /* renamed from: l */
        public final RemoteViews m57723l(RemoteViews remoteViews, boolean z) {
            int min;
            int i = 0;
            RemoteViews applyStandardTemplate = applyStandardTemplate(true, R.layout.notification_template_custom_big, false);
            applyStandardTemplate.removeAllViews(R.id.actions);
            List m57721n = m57721n(this.mBuilder.mActions);
            if (z && m57721n != null && (min = Math.min(m57721n.size(), 3)) > 0) {
                for (int i2 = 0; i2 < min; i2++) {
                    applyStandardTemplate.addView(R.id.actions, m57722m((Action) m57721n.get(i2)));
                }
            } else {
                i = 8;
            }
            applyStandardTemplate.setViewVisibility(R.id.actions, i);
            applyStandardTemplate.setViewVisibility(R.id.action_divider, i);
            buildIntoRemoteViews(applyStandardTemplate, remoteViews);
            return applyStandardTemplate;
        }

        /* renamed from: m */
        public final RemoteViews m57722m(Action action) {
            boolean z;
            int i;
            if (action.actionIntent == null) {
                z = true;
            } else {
                z = false;
            }
            String packageName = this.mBuilder.mContext.getPackageName();
            if (z) {
                i = R.layout.notification_action_tombstone;
            } else {
                i = R.layout.notification_action;
            }
            RemoteViews remoteViews = new RemoteViews(packageName, i);
            IconCompat iconCompat = action.getIconCompat();
            if (iconCompat != null) {
                remoteViews.setImageViewBitmap(R.id.action_image, m57684h(iconCompat, R.color.notification_action_color_filter));
            }
            remoteViews.setTextViewText(R.id.action_text, action.title);
            if (!z) {
                remoteViews.setOnClickPendingIntent(R.id.action_container, action.actionIntent);
            }
            C3864a.m57720a(remoteViews, R.id.action_container, action.title);
            return remoteViews;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews makeBigContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews bigContentView = this.mBuilder.getBigContentView();
            if (bigContentView == null) {
                bigContentView = this.mBuilder.getContentView();
            }
            if (bigContentView == null) {
                return null;
            }
            return m57723l(bigContentView, true);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews makeContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            if (Build.VERSION.SDK_INT >= 24 || this.mBuilder.getContentView() == null) {
                return null;
            }
            return m57723l(this.mBuilder.getContentView(), false);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews makeHeadsUpContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            RemoteViews contentView;
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews headsUpContentView = this.mBuilder.getHeadsUpContentView();
            if (headsUpContentView != null) {
                contentView = headsUpContentView;
            } else {
                contentView = this.mBuilder.getContentView();
            }
            if (headsUpContentView == null) {
                return null;
            }
            return m57723l(contentView, true);
        }
    }

    /* loaded from: classes2.dex */
    public interface Extender {
        @NonNull
        Builder extend(@NonNull Builder builder);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes2.dex */
    public @interface GroupAlertBehavior {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes2.dex */
    public @interface NotificationVisibility {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes2.dex */
    public @interface ServiceNotificationBehavior {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes2.dex */
    public @interface StreamType {
    }

    /* loaded from: classes2.dex */
    public static abstract class Style {

        /* renamed from: a */
        public CharSequence f33727a;

        /* renamed from: b */
        public CharSequence f33728b;

        /* renamed from: c */
        public boolean f33729c = false;
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        protected Builder mBuilder;

        /* renamed from: androidx.core.app.NotificationCompat$Style$a */
        /* loaded from: classes2.dex */
        public static class C3874a {
            @DoNotInline
            /* renamed from: a */
            public static void m57680a(RemoteViews remoteViews, int i, int i2, float f) {
                remoteViews.setTextViewTextSize(i, i2, f);
            }

            @DoNotInline
            /* renamed from: b */
            public static void m57679b(RemoteViews remoteViews, int i, int i2, int i3, int i4, int i5) {
                remoteViews.setViewPadding(i, i2, i3, i4, i5);
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$Style$b */
        /* loaded from: classes2.dex */
        public static class C3875b {
            @DoNotInline
            /* renamed from: a */
            public static void m57678a(RemoteViews remoteViews, int i, boolean z) {
                remoteViews.setChronometerCountDown(i, z);
            }
        }

        /* renamed from: b */
        public static float m57690b(float f, float f2, float f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }

        /* renamed from: c */
        public static Style m57689c(String str) {
            if (str != null) {
                char c = 65535;
                switch (str.hashCode()) {
                    case -716705180:
                        if (str.equals("androidx.core.app.NotificationCompat$DecoratedCustomViewStyle")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -171946061:
                        if (str.equals("androidx.core.app.NotificationCompat$BigPictureStyle")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 714386739:
                        if (str.equals("androidx.core.app.NotificationCompat$CallStyle")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 912942987:
                        if (str.equals("androidx.core.app.NotificationCompat$InboxStyle")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 919595044:
                        if (str.equals("androidx.core.app.NotificationCompat$BigTextStyle")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 2090799565:
                        if (str.equals("androidx.core.app.NotificationCompat$MessagingStyle")) {
                            c = 5;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        return new DecoratedCustomViewStyle();
                    case 1:
                        return new BigPictureStyle();
                    case 2:
                        return new CallStyle();
                    case 3:
                        return new InboxStyle();
                    case 4:
                        return new BigTextStyle();
                    case 5:
                        return new MessagingStyle();
                    default:
                        return null;
                }
            }
            return null;
        }

        /* renamed from: d */
        public static Style m57688d(String str) {
            if (str == null) {
                return null;
            }
            int i = Build.VERSION.SDK_INT;
            if (str.equals(Notification.BigPictureStyle.class.getName())) {
                return new BigPictureStyle();
            }
            if (str.equals(Notification.BigTextStyle.class.getName())) {
                return new BigTextStyle();
            }
            if (str.equals(Notification.InboxStyle.class.getName())) {
                return new InboxStyle();
            }
            if (i >= 24) {
                if (str.equals(AbstractC20418iJ0.m30994a().getName())) {
                    return new MessagingStyle();
                }
                if (str.equals(AbstractC20591jJ0.m29544a().getName())) {
                    return new DecoratedCustomViewStyle();
                }
            }
            return null;
        }

        /* renamed from: e */
        public static Style m57687e(Bundle bundle) {
            Style m57689c = m57689c(bundle.getString(NotificationCompat.EXTRA_COMPAT_TEMPLATE));
            if (m57689c != null) {
                return m57689c;
            }
            if (!bundle.containsKey(NotificationCompat.EXTRA_SELF_DISPLAY_NAME) && !bundle.containsKey(NotificationCompat.EXTRA_MESSAGING_STYLE_USER)) {
                if (!bundle.containsKey(NotificationCompat.EXTRA_PICTURE) && !bundle.containsKey(NotificationCompat.EXTRA_PICTURE_ICON)) {
                    if (bundle.containsKey(NotificationCompat.EXTRA_BIG_TEXT)) {
                        return new BigTextStyle();
                    }
                    if (bundle.containsKey(NotificationCompat.EXTRA_TEXT_LINES)) {
                        return new InboxStyle();
                    }
                    if (bundle.containsKey(NotificationCompat.EXTRA_CALL_TYPE)) {
                        return new CallStyle();
                    }
                    return m57688d(bundle.getString(NotificationCompat.EXTRA_TEMPLATE));
                }
                return new BigPictureStyle();
            }
            return new MessagingStyle();
        }

        @Nullable
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public static Style extractStyleFromNotification(@NonNull Notification notification) {
            Bundle extras = NotificationCompat.getExtras(notification);
            if (extras == null) {
                return null;
            }
            return m57686f(extras);
        }

        /* renamed from: f */
        public static Style m57686f(Bundle bundle) {
            Style m57687e = m57687e(bundle);
            if (m57687e == null) {
                return null;
            }
            try {
                m57687e.restoreFromCompatExtras(bundle);
                return m57687e;
            } catch (ClassCastException unused) {
                return null;
            }
        }

        /* renamed from: a */
        public final int m57691a() {
            Resources resources = this.mBuilder.mContext.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.notification_top_pad);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.notification_top_pad_large_text);
            float m57690b = (m57690b(resources.getConfiguration().fontScale, 1.0f, 1.3f) - 1.0f) / 0.29999995f;
            return Math.round(((1.0f - m57690b) * dimensionPixelSize) + (m57690b * dimensionPixelSize2));
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void addCompatExtras(@NonNull Bundle bundle) {
            if (this.f33729c) {
                bundle.putCharSequence(NotificationCompat.EXTRA_SUMMARY_TEXT, this.f33728b);
            }
            CharSequence charSequence = this.f33727a;
            if (charSequence != null) {
                bundle.putCharSequence(NotificationCompat.EXTRA_TITLE_BIG, charSequence);
            }
            String className = getClassName();
            if (className != null) {
                bundle.putString(NotificationCompat.EXTRA_COMPAT_TEMPLATE, className);
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0145  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0191  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0196  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0198  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x01a2  */
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public android.widget.RemoteViews applyStandardTemplate(boolean r13, int r14, boolean r15) {
            /*
                Method dump skipped, instructions count: 424
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.NotificationCompat.Style.applyStandardTemplate(boolean, int, boolean):android.widget.RemoteViews");
        }

        @Nullable
        public Notification build() {
            Builder builder = this.mBuilder;
            if (builder != null) {
                return builder.build();
            }
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void buildIntoRemoteViews(RemoteViews remoteViews, RemoteViews remoteViews2) {
            m57681k(remoteViews);
            remoteViews.removeAllViews(R.id.notification_main_column);
            remoteViews.addView(R.id.notification_main_column, remoteViews2.clone());
            remoteViews.setViewVisibility(R.id.notification_main_column, 0);
            C3874a.m57679b(remoteViews, R.id.notification_main_column_container, 0, m57691a(), 0, 0);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void clearCompatExtraKeys(@NonNull Bundle bundle) {
            bundle.remove(NotificationCompat.EXTRA_SUMMARY_TEXT);
            bundle.remove(NotificationCompat.EXTRA_TITLE_BIG);
            bundle.remove(NotificationCompat.EXTRA_COMPAT_TEMPLATE);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public Bitmap createColoredBitmap(int i, int i2) {
            return m57685g(i, i2, 0);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public boolean displayCustomViewInline() {
            return false;
        }

        /* renamed from: g */
        public final Bitmap m57685g(int i, int i2, int i3) {
            return m57683i(IconCompat.createWithResource(this.mBuilder.mContext, i), i2, i3);
        }

        @Nullable
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public String getClassName() {
            return null;
        }

        /* renamed from: h */
        public Bitmap m57684h(IconCompat iconCompat, int i) {
            return m57683i(iconCompat, i, 0);
        }

        /* renamed from: i */
        public final Bitmap m57683i(IconCompat iconCompat, int i, int i2) {
            int i3;
            Drawable loadDrawable = iconCompat.loadDrawable(this.mBuilder.mContext);
            if (i2 == 0) {
                i3 = loadDrawable.getIntrinsicWidth();
            } else {
                i3 = i2;
            }
            if (i2 == 0) {
                i2 = loadDrawable.getIntrinsicHeight();
            }
            Bitmap createBitmap = Bitmap.createBitmap(i3, i2, Bitmap.Config.ARGB_8888);
            loadDrawable.setBounds(0, 0, i3, i2);
            if (i != 0) {
                loadDrawable.mutate().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
            }
            loadDrawable.draw(new Canvas(createBitmap));
            return createBitmap;
        }

        /* renamed from: j */
        public final Bitmap m57682j(int i, int i2, int i3, int i4) {
            int i5 = R.drawable.notification_icon_background;
            if (i4 == 0) {
                i4 = 0;
            }
            Bitmap m57685g = m57685g(i5, i4, i2);
            Canvas canvas = new Canvas(m57685g);
            Drawable mutate = this.mBuilder.mContext.getResources().getDrawable(i).mutate();
            mutate.setFilterBitmap(true);
            int i6 = (i2 - i3) / 2;
            int i7 = i3 + i6;
            mutate.setBounds(i6, i6, i7, i7);
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            mutate.draw(canvas);
            return m57685g;
        }

        /* renamed from: k */
        public final void m57681k(RemoteViews remoteViews) {
            remoteViews.setViewVisibility(R.id.title, 8);
            remoteViews.setViewVisibility(R.id.text2, 8);
            remoteViews.setViewVisibility(R.id.text, 8);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews makeBigContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews makeContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews makeHeadsUpContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void restoreFromCompatExtras(@NonNull Bundle bundle) {
            if (bundle.containsKey(NotificationCompat.EXTRA_SUMMARY_TEXT)) {
                this.f33728b = bundle.getCharSequence(NotificationCompat.EXTRA_SUMMARY_TEXT);
                this.f33729c = true;
            }
            this.f33727a = bundle.getCharSequence(NotificationCompat.EXTRA_TITLE_BIG);
        }

        public void setBuilder(@Nullable Builder builder) {
            if (this.mBuilder != builder) {
                this.mBuilder = builder;
                if (builder != null) {
                    builder.setStyle(this);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class WearableExtender implements Extender {
        @Deprecated
        public static final int SCREEN_TIMEOUT_LONG = -1;
        @Deprecated
        public static final int SCREEN_TIMEOUT_SHORT = 0;
        @Deprecated
        public static final int SIZE_DEFAULT = 0;
        @Deprecated
        public static final int SIZE_FULL_SCREEN = 5;
        @Deprecated
        public static final int SIZE_LARGE = 4;
        @Deprecated
        public static final int SIZE_MEDIUM = 3;
        @Deprecated
        public static final int SIZE_SMALL = 2;
        @Deprecated
        public static final int SIZE_XSMALL = 1;
        public static final int UNSET_ACTION_INDEX = -1;

        /* renamed from: a */
        public ArrayList f33730a;

        /* renamed from: b */
        public int f33731b;

        /* renamed from: c */
        public PendingIntent f33732c;

        /* renamed from: d */
        public ArrayList f33733d;

        /* renamed from: e */
        public Bitmap f33734e;

        /* renamed from: f */
        public int f33735f;

        /* renamed from: g */
        public int f33736g;

        /* renamed from: h */
        public int f33737h;

        /* renamed from: i */
        public int f33738i;

        /* renamed from: j */
        public int f33739j;

        /* renamed from: k */
        public int f33740k;

        /* renamed from: l */
        public int f33741l;

        /* renamed from: m */
        public String f33742m;

        /* renamed from: n */
        public String f33743n;

        /* renamed from: androidx.core.app.NotificationCompat$WearableExtender$a */
        /* loaded from: classes2.dex */
        public static class C3876a {
            @DoNotInline
            /* renamed from: a */
            public static Notification.Action.Builder m57675a(Notification.Action.Builder builder, Bundle bundle) {
                return builder.addExtras(bundle);
            }

            @DoNotInline
            /* renamed from: b */
            public static Notification.Action.Builder m57674b(Notification.Action.Builder builder, android.app.RemoteInput remoteInput) {
                return builder.addRemoteInput(remoteInput);
            }

            @DoNotInline
            /* renamed from: c */
            public static Notification.Action m57673c(Notification.Action.Builder builder) {
                return builder.build();
            }

            @DoNotInline
            /* renamed from: d */
            public static Notification.Action.Builder m57672d(int i, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(i, charSequence, pendingIntent);
            }

            @DoNotInline
            /* renamed from: e */
            public static Action m57671e(ArrayList<Parcelable> arrayList, int i) {
                return NotificationCompat.m57809a((Notification.Action) arrayList.get(i));
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$WearableExtender$b */
        /* loaded from: classes2.dex */
        public static class C3877b {
            @DoNotInline
            /* renamed from: a */
            public static Notification.Action.Builder m57670a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(icon, charSequence, pendingIntent);
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$WearableExtender$c */
        /* loaded from: classes2.dex */
        public static class C3878c {
            @DoNotInline
            /* renamed from: a */
            public static Notification.Action.Builder m57669a(Notification.Action.Builder builder, boolean z) {
                return builder.setAllowGeneratedReplies(z);
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$WearableExtender$d */
        /* loaded from: classes2.dex */
        public static class C3879d {
            @DoNotInline
            /* renamed from: a */
            public static Notification.Action.Builder m57668a(Notification.Action.Builder builder, boolean z) {
                return builder.setAuthenticationRequired(z);
            }
        }

        public WearableExtender() {
            this.f33730a = new ArrayList();
            this.f33731b = 1;
            this.f33733d = new ArrayList();
            this.f33736g = GravityCompat.END;
            this.f33737h = -1;
            this.f33738i = 0;
            this.f33740k = 80;
        }

        /* renamed from: a */
        public static Notification.Action m57677a(Action action) {
            int i;
            Notification.Action.Builder m57672d;
            Bundle bundle;
            Icon icon;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 23) {
                IconCompat iconCompat = action.getIconCompat();
                if (iconCompat == null) {
                    icon = null;
                } else {
                    icon = iconCompat.toIcon();
                }
                m57672d = C3877b.m57670a(icon, action.getTitle(), action.getActionIntent());
            } else {
                IconCompat iconCompat2 = action.getIconCompat();
                if (iconCompat2 != null && iconCompat2.getType() == 2) {
                    i = iconCompat2.getResId();
                } else {
                    i = 0;
                }
                m57672d = C3876a.m57672d(i, action.getTitle(), action.getActionIntent());
            }
            if (action.getExtras() != null) {
                bundle = new Bundle(action.getExtras());
            } else {
                bundle = new Bundle();
            }
            bundle.putBoolean("android.support.allowGeneratedReplies", action.getAllowGeneratedReplies());
            if (i2 >= 24) {
                C3878c.m57669a(m57672d, action.getAllowGeneratedReplies());
            }
            if (i2 >= 31) {
                C3879d.m57668a(m57672d, action.isAuthenticationRequired());
            }
            C3876a.m57675a(m57672d, bundle);
            RemoteInput[] remoteInputs = action.getRemoteInputs();
            if (remoteInputs != null) {
                for (android.app.RemoteInput remoteInput : RemoteInput.m57596b(remoteInputs)) {
                    C3876a.m57674b(m57672d, remoteInput);
                }
            }
            return C3876a.m57673c(m57672d);
        }

        @NonNull
        public WearableExtender addAction(@NonNull Action action) {
            this.f33730a.add(action);
            return this;
        }

        @NonNull
        public WearableExtender addActions(@NonNull List<Action> list) {
            this.f33730a.addAll(list);
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender addPage(@NonNull Notification notification) {
            this.f33733d.add(notification);
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender addPages(@NonNull List<Notification> list) {
            this.f33733d.addAll(list);
            return this;
        }

        /* renamed from: b */
        public final void m57676b(int i, boolean z) {
            if (z) {
                this.f33731b = i | this.f33731b;
                return;
            }
            this.f33731b = (~i) & this.f33731b;
        }

        @NonNull
        public WearableExtender clearActions() {
            this.f33730a.clear();
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender clearPages() {
            this.f33733d.clear();
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.Extender
        @NonNull
        public Builder extend(@NonNull Builder builder) {
            Bundle bundle = new Bundle();
            if (!this.f33730a.isEmpty()) {
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.f33730a.size());
                Iterator it = this.f33730a.iterator();
                while (it.hasNext()) {
                    arrayList.add(m57677a((Action) it.next()));
                }
                bundle.putParcelableArrayList("actions", arrayList);
            }
            int i = this.f33731b;
            if (i != 1) {
                bundle.putInt("flags", i);
            }
            PendingIntent pendingIntent = this.f33732c;
            if (pendingIntent != null) {
                bundle.putParcelable("displayIntent", pendingIntent);
            }
            if (!this.f33733d.isEmpty()) {
                ArrayList arrayList2 = this.f33733d;
                bundle.putParcelableArray("pages", (Parcelable[]) arrayList2.toArray(new Notification[arrayList2.size()]));
            }
            Bitmap bitmap = this.f33734e;
            if (bitmap != null) {
                bundle.putParcelable("background", bitmap);
            }
            int i2 = this.f33735f;
            if (i2 != 0) {
                bundle.putInt("contentIcon", i2);
            }
            int i3 = this.f33736g;
            if (i3 != 8388613) {
                bundle.putInt("contentIconGravity", i3);
            }
            int i4 = this.f33737h;
            if (i4 != -1) {
                bundle.putInt("contentActionIndex", i4);
            }
            int i5 = this.f33738i;
            if (i5 != 0) {
                bundle.putInt("customSizePreset", i5);
            }
            int i6 = this.f33739j;
            if (i6 != 0) {
                bundle.putInt("customContentHeight", i6);
            }
            int i7 = this.f33740k;
            if (i7 != 80) {
                bundle.putInt("gravity", i7);
            }
            int i8 = this.f33741l;
            if (i8 != 0) {
                bundle.putInt("hintScreenTimeout", i8);
            }
            String str = this.f33742m;
            if (str != null) {
                bundle.putString("dismissalId", str);
            }
            String str2 = this.f33743n;
            if (str2 != null) {
                bundle.putString("bridgeTag", str2);
            }
            builder.getExtras().putBundle("android.wearable.EXTENSIONS", bundle);
            return builder;
        }

        @NonNull
        public List<Action> getActions() {
            return this.f33730a;
        }

        @Nullable
        @Deprecated
        public Bitmap getBackground() {
            return this.f33734e;
        }

        @Nullable
        public String getBridgeTag() {
            return this.f33743n;
        }

        public int getContentAction() {
            return this.f33737h;
        }

        @Deprecated
        public int getContentIcon() {
            return this.f33735f;
        }

        @Deprecated
        public int getContentIconGravity() {
            return this.f33736g;
        }

        public boolean getContentIntentAvailableOffline() {
            if ((this.f33731b & 1) != 0) {
                return true;
            }
            return false;
        }

        @Deprecated
        public int getCustomContentHeight() {
            return this.f33739j;
        }

        @Deprecated
        public int getCustomSizePreset() {
            return this.f33738i;
        }

        @Nullable
        public String getDismissalId() {
            return this.f33742m;
        }

        @Nullable
        @Deprecated
        public PendingIntent getDisplayIntent() {
            return this.f33732c;
        }

        @Deprecated
        public int getGravity() {
            return this.f33740k;
        }

        @Deprecated
        public boolean getHintAmbientBigPicture() {
            if ((this.f33731b & 32) != 0) {
                return true;
            }
            return false;
        }

        @Deprecated
        public boolean getHintAvoidBackgroundClipping() {
            if ((this.f33731b & 16) != 0) {
                return true;
            }
            return false;
        }

        public boolean getHintContentIntentLaunchesActivity() {
            if ((this.f33731b & 64) != 0) {
                return true;
            }
            return false;
        }

        @Deprecated
        public boolean getHintHideIcon() {
            if ((this.f33731b & 2) != 0) {
                return true;
            }
            return false;
        }

        @Deprecated
        public int getHintScreenTimeout() {
            return this.f33741l;
        }

        @Deprecated
        public boolean getHintShowBackgroundOnly() {
            if ((this.f33731b & 4) != 0) {
                return true;
            }
            return false;
        }

        @NonNull
        @Deprecated
        public List<Notification> getPages() {
            return this.f33733d;
        }

        public boolean getStartScrollBottom() {
            if ((this.f33731b & 8) != 0) {
                return true;
            }
            return false;
        }

        @NonNull
        @Deprecated
        public WearableExtender setBackground(@Nullable Bitmap bitmap) {
            this.f33734e = bitmap;
            return this;
        }

        @NonNull
        public WearableExtender setBridgeTag(@Nullable String str) {
            this.f33743n = str;
            return this;
        }

        @NonNull
        public WearableExtender setContentAction(int i) {
            this.f33737h = i;
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender setContentIcon(int i) {
            this.f33735f = i;
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender setContentIconGravity(int i) {
            this.f33736g = i;
            return this;
        }

        @NonNull
        public WearableExtender setContentIntentAvailableOffline(boolean z) {
            m57676b(1, z);
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender setCustomContentHeight(int i) {
            this.f33739j = i;
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender setCustomSizePreset(int i) {
            this.f33738i = i;
            return this;
        }

        @NonNull
        public WearableExtender setDismissalId(@Nullable String str) {
            this.f33742m = str;
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender setDisplayIntent(@Nullable PendingIntent pendingIntent) {
            this.f33732c = pendingIntent;
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender setGravity(int i) {
            this.f33740k = i;
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender setHintAmbientBigPicture(boolean z) {
            m57676b(32, z);
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender setHintAvoidBackgroundClipping(boolean z) {
            m57676b(16, z);
            return this;
        }

        @NonNull
        public WearableExtender setHintContentIntentLaunchesActivity(boolean z) {
            m57676b(64, z);
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender setHintHideIcon(boolean z) {
            m57676b(2, z);
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender setHintScreenTimeout(int i) {
            this.f33741l = i;
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender setHintShowBackgroundOnly(boolean z) {
            m57676b(4, z);
            return this;
        }

        @NonNull
        public WearableExtender setStartScrollBottom(boolean z) {
            m57676b(8, z);
            return this;
        }

        @NonNull
        /* renamed from: clone */
        public WearableExtender m74090clone() {
            WearableExtender wearableExtender = new WearableExtender();
            wearableExtender.f33730a = new ArrayList(this.f33730a);
            wearableExtender.f33731b = this.f33731b;
            wearableExtender.f33732c = this.f33732c;
            wearableExtender.f33733d = new ArrayList(this.f33733d);
            wearableExtender.f33734e = this.f33734e;
            wearableExtender.f33735f = this.f33735f;
            wearableExtender.f33736g = this.f33736g;
            wearableExtender.f33737h = this.f33737h;
            wearableExtender.f33738i = this.f33738i;
            wearableExtender.f33739j = this.f33739j;
            wearableExtender.f33740k = this.f33740k;
            wearableExtender.f33741l = this.f33741l;
            wearableExtender.f33742m = this.f33742m;
            wearableExtender.f33743n = this.f33743n;
            return wearableExtender;
        }

        public WearableExtender(@NonNull Notification notification) {
            this.f33730a = new ArrayList();
            this.f33731b = 1;
            this.f33733d = new ArrayList();
            this.f33736g = GravityCompat.END;
            this.f33737h = -1;
            this.f33738i = 0;
            this.f33740k = 80;
            Bundle extras = NotificationCompat.getExtras(notification);
            Bundle bundle = extras != null ? extras.getBundle("android.wearable.EXTENSIONS") : null;
            if (bundle != null) {
                ArrayList parcelableArrayList = bundle.getParcelableArrayList("actions");
                if (parcelableArrayList != null) {
                    int size = parcelableArrayList.size();
                    Action[] actionArr = new Action[size];
                    for (int i = 0; i < size; i++) {
                        actionArr[i] = C3876a.m57671e(parcelableArrayList, i);
                    }
                    Collections.addAll(this.f33730a, actionArr);
                }
                this.f33731b = bundle.getInt("flags", 1);
                this.f33732c = (PendingIntent) bundle.getParcelable("displayIntent");
                Notification[] m57807c = NotificationCompat.m57807c(bundle, "pages");
                if (m57807c != null) {
                    Collections.addAll(this.f33733d, m57807c);
                }
                this.f33734e = (Bitmap) bundle.getParcelable("background");
                this.f33735f = bundle.getInt("contentIcon");
                this.f33736g = bundle.getInt("contentIconGravity", GravityCompat.END);
                this.f33737h = bundle.getInt("contentActionIndex", -1);
                this.f33738i = bundle.getInt("customSizePreset", 0);
                this.f33739j = bundle.getInt("customContentHeight");
                this.f33740k = bundle.getInt("gravity", 80);
                this.f33741l = bundle.getInt("hintScreenTimeout");
                this.f33742m = bundle.getString("dismissalId");
                this.f33743n = bundle.getString("bridgeTag");
            }
        }
    }

    /* renamed from: androidx.core.app.NotificationCompat$b */
    /* loaded from: classes2.dex */
    public static class C3881b {
        @DoNotInline
        /* renamed from: a */
        public static boolean m57667a(android.app.RemoteInput remoteInput) {
            return remoteInput.getAllowFreeFormInput();
        }

        @DoNotInline
        /* renamed from: b */
        public static CharSequence[] m57666b(android.app.RemoteInput remoteInput) {
            return remoteInput.getChoices();
        }

        @DoNotInline
        /* renamed from: c */
        public static Bundle m57665c(Notification.Action action) {
            return action.getExtras();
        }

        @DoNotInline
        /* renamed from: d */
        public static Bundle m57664d(android.app.RemoteInput remoteInput) {
            return remoteInput.getExtras();
        }

        @DoNotInline
        /* renamed from: e */
        public static String m57663e(Notification notification) {
            return notification.getGroup();
        }

        @DoNotInline
        /* renamed from: f */
        public static CharSequence m57662f(android.app.RemoteInput remoteInput) {
            return remoteInput.getLabel();
        }

        @DoNotInline
        /* renamed from: g */
        public static android.app.RemoteInput[] m57661g(Notification.Action action) {
            return action.getRemoteInputs();
        }

        @DoNotInline
        /* renamed from: h */
        public static String m57660h(android.app.RemoteInput remoteInput) {
            return remoteInput.getResultKey();
        }

        @DoNotInline
        /* renamed from: i */
        public static String m57659i(Notification notification) {
            return notification.getSortKey();
        }
    }

    /* renamed from: androidx.core.app.NotificationCompat$c */
    /* loaded from: classes2.dex */
    public static class C3882c {
        @DoNotInline
        /* renamed from: a */
        public static Icon m57658a(Notification.Action action) {
            return action.getIcon();
        }
    }

    /* renamed from: androidx.core.app.NotificationCompat$d */
    /* loaded from: classes2.dex */
    public static class C3883d {
        @DoNotInline
        /* renamed from: a */
        public static boolean m57657a(Notification.Action action) {
            return action.getAllowGeneratedReplies();
        }
    }

    /* renamed from: androidx.core.app.NotificationCompat$e */
    /* loaded from: classes2.dex */
    public static class C3884e {
        @DoNotInline
        /* renamed from: a */
        public static int m57656a(Notification notification) {
            return notification.getBadgeIconType();
        }

        @DoNotInline
        /* renamed from: b */
        public static String m57655b(Notification notification) {
            return notification.getChannelId();
        }

        @DoNotInline
        /* renamed from: c */
        public static int m57654c(Notification notification) {
            return notification.getGroupAlertBehavior();
        }

        @DoNotInline
        /* renamed from: d */
        public static CharSequence m57653d(Notification notification) {
            return notification.getSettingsText();
        }

        @DoNotInline
        /* renamed from: e */
        public static String m57652e(Notification notification) {
            return notification.getShortcutId();
        }

        @DoNotInline
        /* renamed from: f */
        public static long m57651f(Notification notification) {
            return notification.getTimeoutAfter();
        }
    }

    /* renamed from: androidx.core.app.NotificationCompat$f */
    /* loaded from: classes2.dex */
    public static class C3885f {
        @DoNotInline
        /* renamed from: a */
        public static int m57650a(Notification.Action action) {
            return action.getSemanticAction();
        }
    }

    /* renamed from: androidx.core.app.NotificationCompat$g */
    /* loaded from: classes2.dex */
    public static class C3886g {
        @DoNotInline
        /* renamed from: a */
        public static boolean m57649a(Notification notification) {
            return notification.getAllowSystemGeneratedContextualActions();
        }

        @DoNotInline
        /* renamed from: b */
        public static Notification.BubbleMetadata m57648b(Notification notification) {
            return notification.getBubbleMetadata();
        }

        @DoNotInline
        /* renamed from: c */
        public static int m57647c(android.app.RemoteInput remoteInput) {
            return remoteInput.getEditChoicesBeforeSending();
        }

        @DoNotInline
        /* renamed from: d */
        public static LocusId m57646d(Notification notification) {
            return notification.getLocusId();
        }

        @DoNotInline
        /* renamed from: e */
        public static boolean m57645e(Notification.Action action) {
            return action.isContextual();
        }
    }

    /* renamed from: androidx.core.app.NotificationCompat$h */
    /* loaded from: classes2.dex */
    public static class C3887h {
        @DoNotInline
        /* renamed from: a */
        public static boolean m57644a(Notification.Action action) {
            return action.isAuthenticationRequired();
        }
    }

    /* renamed from: a */
    public static Action m57809a(Notification.Action action) {
        RemoteInput[] remoteInputArr;
        int i;
        boolean z;
        int i2;
        boolean z2;
        boolean z3;
        int i3;
        android.app.RemoteInput[] m57661g = C3881b.m57661g(action);
        IconCompat iconCompat = null;
        if (m57661g == null) {
            remoteInputArr = null;
        } else {
            RemoteInput[] remoteInputArr2 = new RemoteInput[m57661g.length];
            for (int i4 = 0; i4 < m57661g.length; i4++) {
                android.app.RemoteInput remoteInput = m57661g[i4];
                String m57660h = C3881b.m57660h(remoteInput);
                CharSequence m57662f = C3881b.m57662f(remoteInput);
                CharSequence[] m57666b = C3881b.m57666b(remoteInput);
                boolean m57667a = C3881b.m57667a(remoteInput);
                if (Build.VERSION.SDK_INT >= 29) {
                    i = C3886g.m57647c(remoteInput);
                } else {
                    i = 0;
                }
                remoteInputArr2[i4] = new RemoteInput(m57660h, m57662f, m57666b, m57667a, i, C3881b.m57664d(remoteInput), null);
            }
            remoteInputArr = remoteInputArr2;
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 24) {
            if (!C3881b.m57665c(action).getBoolean("android.support.allowGeneratedReplies") && !C3883d.m57657a(action)) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = C3881b.m57665c(action).getBoolean("android.support.allowGeneratedReplies");
        }
        boolean z4 = z;
        boolean z5 = C3881b.m57665c(action).getBoolean("android.support.action.showsUserInterface", true);
        if (i5 >= 28) {
            i2 = C3885f.m57650a(action);
        } else {
            i2 = C3881b.m57665c(action).getInt("android.support.action.semanticAction", 0);
        }
        int i6 = i2;
        if (i5 >= 29) {
            z2 = C3886g.m57645e(action);
        } else {
            z2 = false;
        }
        if (i5 >= 31) {
            z3 = C3887h.m57644a(action);
        } else {
            z3 = false;
        }
        if (i5 >= 23) {
            if (C3882c.m57658a(action) == null && (i3 = action.icon) != 0) {
                return new Action(i3, action.title, action.actionIntent, C3881b.m57665c(action), remoteInputArr, (RemoteInput[]) null, z4, i6, z5, z2, z3);
            }
            if (C3882c.m57658a(action) != null) {
                iconCompat = IconCompat.createFromIconOrNullIfZeroResId(C3882c.m57658a(action));
            }
            return new Action(iconCompat, action.title, action.actionIntent, C3881b.m57665c(action), remoteInputArr, (RemoteInput[]) null, z4, i6, z5, z2, z3);
        }
        return new Action(action.icon, action.title, action.actionIntent, C3881b.m57665c(action), remoteInputArr, (RemoteInput[]) null, z4, i6, z5, z2, z3);
    }

    /* renamed from: b */
    public static boolean m57808b(Notification notification) {
        if ((notification.flags & 128) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static Notification[] m57807c(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if (!(parcelableArray instanceof Notification[]) && parcelableArray != null) {
            Notification[] notificationArr = new Notification[parcelableArray.length];
            for (int i = 0; i < parcelableArray.length; i++) {
                notificationArr[i] = (Notification) parcelableArray[i];
            }
            bundle.putParcelableArray(str, notificationArr);
            return notificationArr;
        }
        return (Notification[]) parcelableArray;
    }

    @Nullable
    public static Action getAction(@NonNull Notification notification, int i) {
        return m57809a(notification.actions[i]);
    }

    public static int getActionCount(@NonNull Notification notification) {
        Notification.Action[] actionArr = notification.actions;
        if (actionArr != null) {
            return actionArr.length;
        }
        return 0;
    }

    public static boolean getAllowSystemGeneratedContextualActions(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C3886g.m57649a(notification);
        }
        return false;
    }

    public static boolean getAutoCancel(@NonNull Notification notification) {
        if ((notification.flags & 16) != 0) {
            return true;
        }
        return false;
    }

    public static int getBadgeIconType(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C3884e.m57656a(notification);
        }
        return 0;
    }

    @Nullable
    public static BubbleMetadata getBubbleMetadata(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return BubbleMetadata.fromPlatform(C3886g.m57648b(notification));
        }
        return null;
    }

    @Nullable
    public static String getCategory(@NonNull Notification notification) {
        return notification.category;
    }

    @Nullable
    public static String getChannelId(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C3884e.m57655b(notification);
        }
        return null;
    }

    public static int getColor(@NonNull Notification notification) {
        return notification.color;
    }

    @Nullable
    @RequiresApi(19)
    public static CharSequence getContentInfo(@NonNull Notification notification) {
        return notification.extras.getCharSequence(EXTRA_INFO_TEXT);
    }

    @Nullable
    @RequiresApi(19)
    public static CharSequence getContentText(@NonNull Notification notification) {
        return notification.extras.getCharSequence(EXTRA_TEXT);
    }

    @Nullable
    @RequiresApi(19)
    public static CharSequence getContentTitle(@NonNull Notification notification) {
        return notification.extras.getCharSequence(EXTRA_TITLE);
    }

    @Nullable
    public static Bundle getExtras(@NonNull Notification notification) {
        return notification.extras;
    }

    @Nullable
    public static String getGroup(@NonNull Notification notification) {
        return C3881b.m57663e(notification);
    }

    public static int getGroupAlertBehavior(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C3884e.m57654c(notification);
        }
        return 0;
    }

    @NonNull
    @RequiresApi(21)
    public static List<Action> getInvisibleActions(@NonNull Notification notification) {
        ArrayList arrayList = new ArrayList();
        Bundle bundle = notification.extras.getBundle("android.car.EXTENSIONS");
        if (bundle == null) {
            return arrayList;
        }
        Bundle bundle2 = bundle.getBundle("invisible_actions");
        if (bundle2 != null) {
            for (int i = 0; i < bundle2.size(); i++) {
                arrayList.add(AbstractC3923b.m57514c(bundle2.getBundle(Integer.toString(i))));
            }
        }
        return arrayList;
    }

    public static boolean getLocalOnly(@NonNull Notification notification) {
        if ((notification.flags & 256) != 0) {
            return true;
        }
        return false;
    }

    @Nullable
    public static LocusIdCompat getLocusId(@NonNull Notification notification) {
        LocusId m57646d;
        if (Build.VERSION.SDK_INT < 29 || (m57646d = C3886g.m57646d(notification)) == null) {
            return null;
        }
        return LocusIdCompat.toLocusIdCompat(m57646d);
    }

    public static boolean getOngoing(@NonNull Notification notification) {
        if ((notification.flags & 2) != 0) {
            return true;
        }
        return false;
    }

    public static boolean getOnlyAlertOnce(@NonNull Notification notification) {
        if ((notification.flags & 8) != 0) {
            return true;
        }
        return false;
    }

    @NonNull
    public static List<Person> getPeople(@NonNull Notification notification) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 28) {
            ArrayList parcelableArrayList = notification.extras.getParcelableArrayList(EXTRA_PEOPLE_LIST);
            if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    arrayList.add(Person.fromAndroidPerson(AbstractC19380cJ0.m51706a(it.next())));
                }
            }
        } else {
            String[] stringArray = notification.extras.getStringArray(EXTRA_PEOPLE);
            if (stringArray != null && stringArray.length != 0) {
                for (String str : stringArray) {
                    arrayList.add(new Person.Builder().setUri(str).build());
                }
            }
        }
        return arrayList;
    }

    @Nullable
    public static Notification getPublicVersion(@NonNull Notification notification) {
        return notification.publicVersion;
    }

    @Nullable
    public static CharSequence getSettingsText(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C3884e.m57653d(notification);
        }
        return null;
    }

    @Nullable
    public static String getShortcutId(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C3884e.m57652e(notification);
        }
        return null;
    }

    @RequiresApi(19)
    public static boolean getShowWhen(@NonNull Notification notification) {
        return notification.extras.getBoolean(EXTRA_SHOW_WHEN);
    }

    @Nullable
    public static String getSortKey(@NonNull Notification notification) {
        return C3881b.m57659i(notification);
    }

    @Nullable
    @RequiresApi(19)
    public static CharSequence getSubText(@NonNull Notification notification) {
        return notification.extras.getCharSequence(EXTRA_SUB_TEXT);
    }

    public static long getTimeoutAfter(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C3884e.m57651f(notification);
        }
        return 0L;
    }

    @RequiresApi(19)
    public static boolean getUsesChronometer(@NonNull Notification notification) {
        return notification.extras.getBoolean(EXTRA_SHOW_CHRONOMETER);
    }

    public static int getVisibility(@NonNull Notification notification) {
        return notification.visibility;
    }

    public static boolean isGroupSummary(@NonNull Notification notification) {
        if ((notification.flags & 512) != 0) {
            return true;
        }
        return false;
    }

    /* loaded from: classes2.dex */
    public static final class CarExtender implements Extender {

        /* renamed from: a */
        public Bitmap f33700a;

        /* renamed from: b */
        public UnreadConversation f33701b;

        /* renamed from: c */
        public int f33702c;

        @Deprecated
        /* loaded from: classes2.dex */
        public static class UnreadConversation {

            /* renamed from: a */
            public final String[] f33703a;

            /* renamed from: b */
            public final RemoteInput f33704b;

            /* renamed from: c */
            public final PendingIntent f33705c;

            /* renamed from: d */
            public final PendingIntent f33706d;

            /* renamed from: e */
            public final String[] f33707e;

            /* renamed from: f */
            public final long f33708f;

            /* loaded from: classes2.dex */
            public static class Builder {

                /* renamed from: a */
                public final List f33709a = new ArrayList();

                /* renamed from: b */
                public final String f33710b;

                /* renamed from: c */
                public RemoteInput f33711c;

                /* renamed from: d */
                public PendingIntent f33712d;

                /* renamed from: e */
                public PendingIntent f33713e;

                /* renamed from: f */
                public long f33714f;

                public Builder(@NonNull String str) {
                    this.f33710b = str;
                }

                @NonNull
                public Builder addMessage(@Nullable String str) {
                    if (str != null) {
                        this.f33709a.add(str);
                    }
                    return this;
                }

                @NonNull
                public UnreadConversation build() {
                    List list = this.f33709a;
                    return new UnreadConversation((String[]) list.toArray(new String[list.size()]), this.f33711c, this.f33713e, this.f33712d, new String[]{this.f33710b}, this.f33714f);
                }

                @NonNull
                public Builder setLatestTimestamp(long j) {
                    this.f33714f = j;
                    return this;
                }

                @NonNull
                public Builder setReadPendingIntent(@Nullable PendingIntent pendingIntent) {
                    this.f33712d = pendingIntent;
                    return this;
                }

                @NonNull
                public Builder setReplyAction(@Nullable PendingIntent pendingIntent, @Nullable RemoteInput remoteInput) {
                    this.f33711c = remoteInput;
                    this.f33713e = pendingIntent;
                    return this;
                }
            }

            public UnreadConversation(String[] strArr, RemoteInput remoteInput, PendingIntent pendingIntent, PendingIntent pendingIntent2, String[] strArr2, long j) {
                this.f33703a = strArr;
                this.f33704b = remoteInput;
                this.f33706d = pendingIntent2;
                this.f33705c = pendingIntent;
                this.f33707e = strArr2;
                this.f33708f = j;
            }

            public long getLatestTimestamp() {
                return this.f33708f;
            }

            @Nullable
            public String[] getMessages() {
                return this.f33703a;
            }

            @Nullable
            public String getParticipant() {
                String[] strArr = this.f33707e;
                if (strArr.length > 0) {
                    return strArr[0];
                }
                return null;
            }

            @Nullable
            public String[] getParticipants() {
                return this.f33707e;
            }

            @Nullable
            public PendingIntent getReadPendingIntent() {
                return this.f33706d;
            }

            @Nullable
            public RemoteInput getRemoteInput() {
                return this.f33704b;
            }

            @Nullable
            public PendingIntent getReplyPendingIntent() {
                return this.f33705c;
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$CarExtender$a */
        /* loaded from: classes2.dex */
        public static class C3862a {
            @DoNotInline
            /* renamed from: a */
            public static RemoteInput.Builder m57735a(RemoteInput.Builder builder, Bundle bundle) {
                return builder.addExtras(bundle);
            }

            @DoNotInline
            /* renamed from: b */
            public static android.app.RemoteInput m57734b(RemoteInput.Builder builder) {
                return builder.build();
            }

            @DoNotInline
            /* renamed from: c */
            public static RemoteInput.Builder m57733c(String str) {
                return new RemoteInput.Builder(str);
            }

            @DoNotInline
            /* renamed from: d */
            public static boolean m57732d(android.app.RemoteInput remoteInput) {
                return remoteInput.getAllowFreeFormInput();
            }

            @DoNotInline
            /* renamed from: e */
            public static CharSequence[] m57731e(android.app.RemoteInput remoteInput) {
                return remoteInput.getChoices();
            }

            @DoNotInline
            /* renamed from: f */
            public static Bundle m57730f(android.app.RemoteInput remoteInput) {
                return remoteInput.getExtras();
            }

            @DoNotInline
            /* renamed from: g */
            public static CharSequence m57729g(android.app.RemoteInput remoteInput) {
                return remoteInput.getLabel();
            }

            @DoNotInline
            /* renamed from: h */
            public static String m57728h(android.app.RemoteInput remoteInput) {
                return remoteInput.getResultKey();
            }

            @DoNotInline
            /* renamed from: i */
            public static RemoteInput.Builder m57727i(RemoteInput.Builder builder, boolean z) {
                return builder.setAllowFreeFormInput(z);
            }

            @DoNotInline
            /* renamed from: j */
            public static RemoteInput.Builder m57726j(RemoteInput.Builder builder, CharSequence[] charSequenceArr) {
                return builder.setChoices(charSequenceArr);
            }

            @DoNotInline
            /* renamed from: k */
            public static RemoteInput.Builder m57725k(RemoteInput.Builder builder, CharSequence charSequence) {
                return builder.setLabel(charSequence);
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$CarExtender$b */
        /* loaded from: classes2.dex */
        public static class C3863b {
            @DoNotInline
            /* renamed from: a */
            public static int m57724a(android.app.RemoteInput remoteInput) {
                return remoteInput.getEditChoicesBeforeSending();
            }
        }

        public CarExtender() {
            this.f33702c = 0;
        }

        /* renamed from: a */
        public static Bundle m57737a(UnreadConversation unreadConversation) {
            String str;
            Bundle bundle = new Bundle();
            if (unreadConversation.getParticipants() != null && unreadConversation.getParticipants().length > 1) {
                str = unreadConversation.getParticipants()[0];
            } else {
                str = null;
            }
            int length = unreadConversation.getMessages().length;
            Parcelable[] parcelableArr = new Parcelable[length];
            for (int i = 0; i < length; i++) {
                Bundle bundle2 = new Bundle();
                bundle2.putString(TextBundle.TEXT_ENTRY, unreadConversation.getMessages()[i]);
                bundle2.putString("author", str);
                parcelableArr[i] = bundle2;
            }
            bundle.putParcelableArray("messages", parcelableArr);
            RemoteInput remoteInput = unreadConversation.getRemoteInput();
            if (remoteInput != null) {
                RemoteInput.Builder m57733c = C3862a.m57733c(remoteInput.getResultKey());
                C3862a.m57725k(m57733c, remoteInput.getLabel());
                C3862a.m57726j(m57733c, remoteInput.getChoices());
                C3862a.m57727i(m57733c, remoteInput.getAllowFreeFormInput());
                C3862a.m57735a(m57733c, remoteInput.getExtras());
                bundle.putParcelable("remote_input", C3862a.m57734b(m57733c));
            }
            bundle.putParcelable("on_reply", unreadConversation.getReplyPendingIntent());
            bundle.putParcelable("on_read", unreadConversation.getReadPendingIntent());
            bundle.putStringArray("participants", unreadConversation.getParticipants());
            bundle.putLong("timestamp", unreadConversation.getLatestTimestamp());
            return bundle;
        }

        /* renamed from: b */
        public static UnreadConversation m57736b(Bundle bundle) {
            String[] strArr;
            int i;
            RemoteInput remoteInput = null;
            if (bundle == null) {
                return null;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("messages");
            if (parcelableArray != null) {
                int length = parcelableArray.length;
                String[] strArr2 = new String[length];
                for (int i2 = 0; i2 < length; i2++) {
                    Parcelable parcelable = parcelableArray[i2];
                    if (parcelable instanceof Bundle) {
                        String string = ((Bundle) parcelable).getString(TextBundle.TEXT_ENTRY);
                        strArr2[i2] = string;
                        if (string != null) {
                        }
                    }
                    return null;
                }
                strArr = strArr2;
            } else {
                strArr = null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("on_read");
            PendingIntent pendingIntent2 = (PendingIntent) bundle.getParcelable("on_reply");
            android.app.RemoteInput remoteInput2 = (android.app.RemoteInput) bundle.getParcelable("remote_input");
            String[] stringArray = bundle.getStringArray("participants");
            if (stringArray == null || stringArray.length != 1) {
                return null;
            }
            if (remoteInput2 != null) {
                String m57728h = C3862a.m57728h(remoteInput2);
                CharSequence m57729g = C3862a.m57729g(remoteInput2);
                CharSequence[] m57731e = C3862a.m57731e(remoteInput2);
                boolean m57732d = C3862a.m57732d(remoteInput2);
                if (Build.VERSION.SDK_INT >= 29) {
                    i = C3863b.m57724a(remoteInput2);
                } else {
                    i = 0;
                }
                remoteInput = new RemoteInput(m57728h, m57729g, m57731e, m57732d, i, C3862a.m57730f(remoteInput2), null);
            }
            return new UnreadConversation(strArr, remoteInput, pendingIntent2, pendingIntent, stringArray, bundle.getLong("timestamp"));
        }

        @Override // androidx.core.app.NotificationCompat.Extender
        @NonNull
        public Builder extend(@NonNull Builder builder) {
            Bundle bundle = new Bundle();
            Bitmap bitmap = this.f33700a;
            if (bitmap != null) {
                bundle.putParcelable("large_icon", bitmap);
            }
            int i = this.f33702c;
            if (i != 0) {
                bundle.putInt("app_color", i);
            }
            UnreadConversation unreadConversation = this.f33701b;
            if (unreadConversation != null) {
                bundle.putBundle("car_conversation", m57737a(unreadConversation));
            }
            builder.getExtras().putBundle("android.car.EXTENSIONS", bundle);
            return builder;
        }

        @ColorInt
        public int getColor() {
            return this.f33702c;
        }

        @Nullable
        public Bitmap getLargeIcon() {
            return this.f33700a;
        }

        @Nullable
        @Deprecated
        public UnreadConversation getUnreadConversation() {
            return this.f33701b;
        }

        @NonNull
        public CarExtender setColor(@ColorInt int i) {
            this.f33702c = i;
            return this;
        }

        @NonNull
        public CarExtender setLargeIcon(@Nullable Bitmap bitmap) {
            this.f33700a = bitmap;
            return this;
        }

        @NonNull
        @Deprecated
        public CarExtender setUnreadConversation(@Nullable UnreadConversation unreadConversation) {
            this.f33701b = unreadConversation;
            return this;
        }

        public CarExtender(@NonNull Notification notification) {
            this.f33702c = 0;
            Bundle bundle = NotificationCompat.getExtras(notification) == null ? null : NotificationCompat.getExtras(notification).getBundle("android.car.EXTENSIONS");
            if (bundle != null) {
                this.f33700a = (Bitmap) bundle.getParcelable("large_icon");
                this.f33702c = bundle.getInt("app_color", 0);
                this.f33701b = m57736b(bundle.getBundle("car_conversation"));
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class InboxStyle extends Style {

        /* renamed from: d */
        public ArrayList f33715d = new ArrayList();

        /* renamed from: androidx.core.app.NotificationCompat$InboxStyle$a */
        /* loaded from: classes2.dex */
        public static class C3867a {
            @DoNotInline
            /* renamed from: a */
            public static Notification.InboxStyle m57717a(Notification.InboxStyle inboxStyle, CharSequence charSequence) {
                return inboxStyle.addLine(charSequence);
            }

            @DoNotInline
            /* renamed from: b */
            public static Notification.InboxStyle m57716b(Notification.Builder builder) {
                return new Notification.InboxStyle(builder);
            }

            @DoNotInline
            /* renamed from: c */
            public static Notification.InboxStyle m57715c(Notification.InboxStyle inboxStyle, CharSequence charSequence) {
                return inboxStyle.setBigContentTitle(charSequence);
            }

            @DoNotInline
            /* renamed from: d */
            public static Notification.InboxStyle m57714d(Notification.InboxStyle inboxStyle, CharSequence charSequence) {
                return inboxStyle.setSummaryText(charSequence);
            }
        }

        public InboxStyle() {
        }

        @NonNull
        public InboxStyle addLine(@Nullable CharSequence charSequence) {
            if (charSequence != null) {
                this.f33715d.add(Builder.limitCharSequenceLength(charSequence));
            }
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            Notification.InboxStyle m57715c = C3867a.m57715c(C3867a.m57716b(notificationBuilderWithBuilderAccessor.getBuilder()), this.f33727a);
            if (this.f33729c) {
                C3867a.m57714d(m57715c, this.f33728b);
            }
            Iterator it = this.f33715d.iterator();
            while (it.hasNext()) {
                C3867a.m57717a(m57715c, (CharSequence) it.next());
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void clearCompatExtraKeys(@NonNull Bundle bundle) {
            super.clearCompatExtraKeys(bundle);
            bundle.remove(NotificationCompat.EXTRA_TEXT_LINES);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public String getClassName() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void restoreFromCompatExtras(@NonNull Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            this.f33715d.clear();
            if (bundle.containsKey(NotificationCompat.EXTRA_TEXT_LINES)) {
                Collections.addAll(this.f33715d, bundle.getCharSequenceArray(NotificationCompat.EXTRA_TEXT_LINES));
            }
        }

        @NonNull
        public InboxStyle setBigContentTitle(@Nullable CharSequence charSequence) {
            this.f33727a = Builder.limitCharSequenceLength(charSequence);
            return this;
        }

        @NonNull
        public InboxStyle setSummaryText(@Nullable CharSequence charSequence) {
            this.f33728b = Builder.limitCharSequenceLength(charSequence);
            this.f33729c = true;
            return this;
        }

        public InboxStyle(@Nullable Builder builder) {
            setBuilder(builder);
        }
    }

    /* loaded from: classes2.dex */
    public static class MessagingStyle extends Style {
        public static final int MAXIMUM_RETAINED_MESSAGES = 25;

        /* renamed from: d */
        public final List f33716d = new ArrayList();

        /* renamed from: e */
        public final List f33717e = new ArrayList();

        /* renamed from: f */
        public Person f33718f;

        /* renamed from: g */
        public CharSequence f33719g;

        /* renamed from: h */
        public Boolean f33720h;

        /* renamed from: androidx.core.app.NotificationCompat$MessagingStyle$a */
        /* loaded from: classes2.dex */
        public static class C3870a {
            @DoNotInline
            /* renamed from: a */
            public static Notification.BigTextStyle m57701a(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.bigText(charSequence);
            }

            @DoNotInline
            /* renamed from: b */
            public static Notification.BigTextStyle m57700b(Notification.Builder builder) {
                return new Notification.BigTextStyle(builder);
            }

            @DoNotInline
            /* renamed from: c */
            public static Notification.BigTextStyle m57699c(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.setBigContentTitle(charSequence);
            }

            @DoNotInline
            /* renamed from: d */
            public static void m57698d(Notification.Style style, Notification.Builder builder) {
                style.setBuilder(builder);
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$MessagingStyle$b */
        /* loaded from: classes2.dex */
        public static class C3871b {
            @DoNotInline
            /* renamed from: a */
            public static Notification.MessagingStyle m57697a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addMessage(message);
            }

            @DoNotInline
            /* renamed from: b */
            public static Notification.MessagingStyle m57696b(CharSequence charSequence) {
                return new Notification.MessagingStyle(charSequence);
            }

            @DoNotInline
            /* renamed from: c */
            public static Notification.MessagingStyle m57695c(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
                return messagingStyle.setConversationTitle(charSequence);
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$MessagingStyle$c */
        /* loaded from: classes2.dex */
        public static class C3872c {
            @DoNotInline
            /* renamed from: a */
            public static Notification.MessagingStyle m57694a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addHistoricMessage(message);
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$MessagingStyle$d */
        /* loaded from: classes2.dex */
        public static class C3873d {
            @DoNotInline
            /* renamed from: a */
            public static Notification.MessagingStyle m57693a(android.app.Person person) {
                return new Notification.MessagingStyle(person);
            }

            @DoNotInline
            /* renamed from: b */
            public static Notification.MessagingStyle m57692b(Notification.MessagingStyle messagingStyle, boolean z) {
                return messagingStyle.setGroupConversation(z);
            }
        }

        public MessagingStyle() {
        }

        @Nullable
        public static MessagingStyle extractMessagingStyleFromNotification(@NonNull Notification notification) {
            Style extractStyleFromNotification = Style.extractStyleFromNotification(notification);
            if (extractStyleFromNotification instanceof MessagingStyle) {
                return (MessagingStyle) extractStyleFromNotification;
            }
            return null;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void addCompatExtras(@NonNull Bundle bundle) {
            super.addCompatExtras(bundle);
            bundle.putCharSequence(NotificationCompat.EXTRA_SELF_DISPLAY_NAME, this.f33718f.getName());
            bundle.putBundle(NotificationCompat.EXTRA_MESSAGING_STYLE_USER, this.f33718f.toBundle());
            bundle.putCharSequence(NotificationCompat.EXTRA_HIDDEN_CONVERSATION_TITLE, this.f33719g);
            if (this.f33719g != null && this.f33720h.booleanValue()) {
                bundle.putCharSequence(NotificationCompat.EXTRA_CONVERSATION_TITLE, this.f33719g);
            }
            if (!this.f33716d.isEmpty()) {
                bundle.putParcelableArray(NotificationCompat.EXTRA_MESSAGES, Message.m57709a(this.f33716d));
            }
            if (!this.f33717e.isEmpty()) {
                bundle.putParcelableArray(NotificationCompat.EXTRA_HISTORIC_MESSAGES, Message.m57709a(this.f33717e));
            }
            Boolean bool = this.f33720h;
            if (bool != null) {
                bundle.putBoolean(NotificationCompat.EXTRA_IS_GROUP_CONVERSATION, bool.booleanValue());
            }
        }

        @NonNull
        public MessagingStyle addHistoricMessage(@Nullable Message message) {
            if (message != null) {
                this.f33717e.add(message);
                if (this.f33717e.size() > 25) {
                    this.f33717e.remove(0);
                }
            }
            return this;
        }

        @NonNull
        @Deprecated
        public MessagingStyle addMessage(@Nullable CharSequence charSequence, long j, @Nullable CharSequence charSequence2) {
            this.f33716d.add(new Message(charSequence, j, new Person.Builder().setName(charSequence2).build()));
            if (this.f33716d.size() > 25) {
                this.f33716d.remove(0);
            }
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            boolean z;
            CharSequence text;
            CharSequence text2;
            Notification.MessagingStyle m57696b;
            setGroupConversation(isGroupConversation());
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                if (i >= 28) {
                    m57696b = C3873d.m57693a(this.f33718f.toAndroidPerson());
                } else {
                    m57696b = C3871b.m57696b(this.f33718f.getName());
                }
                for (Message message : this.f33716d) {
                    C3871b.m57697a(AbstractC20245hJ0.m31244a(m57696b), message.m57706d());
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    for (Message message2 : this.f33717e) {
                        C3872c.m57694a(AbstractC20245hJ0.m31244a(m57696b), message2.m57706d());
                    }
                }
                if (this.f33720h.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                    C3871b.m57695c(AbstractC20245hJ0.m31244a(m57696b), this.f33719g);
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    C3873d.m57692b(AbstractC20245hJ0.m31244a(m57696b), this.f33720h.booleanValue());
                }
                C3870a.m57698d(m57696b, notificationBuilderWithBuilderAccessor.getBuilder());
                return;
            }
            Message m57713l = m57713l();
            if (this.f33719g != null && this.f33720h.booleanValue()) {
                notificationBuilderWithBuilderAccessor.getBuilder().setContentTitle(this.f33719g);
            } else if (m57713l != null) {
                notificationBuilderWithBuilderAccessor.getBuilder().setContentTitle("");
                if (m57713l.getPerson() != null) {
                    notificationBuilderWithBuilderAccessor.getBuilder().setContentTitle(m57713l.getPerson().getName());
                }
            }
            if (m57713l != null) {
                Notification.Builder builder = notificationBuilderWithBuilderAccessor.getBuilder();
                if (this.f33719g != null) {
                    text2 = m57710o(m57713l);
                } else {
                    text2 = m57713l.getText();
                }
                builder.setContentText(text2);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.f33719g == null && !m57712m()) {
                z = false;
            } else {
                z = true;
            }
            for (int size = this.f33716d.size() - 1; size >= 0; size--) {
                Message message3 = (Message) this.f33716d.get(size);
                if (z) {
                    text = m57710o(message3);
                } else {
                    text = message3.getText();
                }
                if (size != this.f33716d.size() - 1) {
                    spannableStringBuilder.insert(0, (CharSequence) "\n");
                }
                spannableStringBuilder.insert(0, text);
            }
            C3870a.m57701a(C3870a.m57699c(C3870a.m57700b(notificationBuilderWithBuilderAccessor.getBuilder()), null), spannableStringBuilder);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void clearCompatExtraKeys(@NonNull Bundle bundle) {
            super.clearCompatExtraKeys(bundle);
            bundle.remove(NotificationCompat.EXTRA_MESSAGING_STYLE_USER);
            bundle.remove(NotificationCompat.EXTRA_SELF_DISPLAY_NAME);
            bundle.remove(NotificationCompat.EXTRA_CONVERSATION_TITLE);
            bundle.remove(NotificationCompat.EXTRA_HIDDEN_CONVERSATION_TITLE);
            bundle.remove(NotificationCompat.EXTRA_MESSAGES);
            bundle.remove(NotificationCompat.EXTRA_HISTORIC_MESSAGES);
            bundle.remove(NotificationCompat.EXTRA_IS_GROUP_CONVERSATION);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public String getClassName() {
            return "androidx.core.app.NotificationCompat$MessagingStyle";
        }

        @Nullable
        public CharSequence getConversationTitle() {
            return this.f33719g;
        }

        @NonNull
        public List<Message> getHistoricMessages() {
            return this.f33717e;
        }

        @NonNull
        public List<Message> getMessages() {
            return this.f33716d;
        }

        @NonNull
        public Person getUser() {
            return this.f33718f;
        }

        @Nullable
        @Deprecated
        public CharSequence getUserDisplayName() {
            return this.f33718f.getName();
        }

        public boolean isGroupConversation() {
            Builder builder = this.mBuilder;
            if (builder != null && builder.mContext.getApplicationInfo().targetSdkVersion < 28 && this.f33720h == null) {
                if (this.f33719g == null) {
                    return false;
                }
                return true;
            }
            Boolean bool = this.f33720h;
            if (bool == null) {
                return false;
            }
            return bool.booleanValue();
        }

        /* renamed from: l */
        public final Message m57713l() {
            List list;
            for (int size = this.f33716d.size() - 1; size >= 0; size--) {
                Message message = (Message) this.f33716d.get(size);
                if (message.getPerson() != null && !TextUtils.isEmpty(message.getPerson().getName())) {
                    return message;
                }
            }
            if (!this.f33716d.isEmpty()) {
                return (Message) this.f33716d.get(list.size() - 1);
            }
            return null;
        }

        /* renamed from: m */
        public final boolean m57712m() {
            for (int size = this.f33716d.size() - 1; size >= 0; size--) {
                Message message = (Message) this.f33716d.get(size);
                if (message.getPerson() != null && message.getPerson().getName() == null) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: n */
        public final TextAppearanceSpan m57711n(int i) {
            return new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i), null);
        }

        /* renamed from: o */
        public final CharSequence m57710o(Message message) {
            CharSequence name;
            BidiFormatter bidiFormatter = BidiFormatter.getInstance();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            CharSequence charSequence = "";
            if (message.getPerson() == null) {
                name = "";
            } else {
                name = message.getPerson().getName();
            }
            int i = -16777216;
            if (TextUtils.isEmpty(name)) {
                name = this.f33718f.getName();
                if (this.mBuilder.getColor() != 0) {
                    i = this.mBuilder.getColor();
                }
            }
            CharSequence unicodeWrap = bidiFormatter.unicodeWrap(name);
            spannableStringBuilder.append(unicodeWrap);
            spannableStringBuilder.setSpan(m57711n(i), spannableStringBuilder.length() - unicodeWrap.length(), spannableStringBuilder.length(), 33);
            if (message.getText() != null) {
                charSequence = message.getText();
            }
            spannableStringBuilder.append((CharSequence) "  ").append(bidiFormatter.unicodeWrap(charSequence));
            return spannableStringBuilder;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void restoreFromCompatExtras(@NonNull Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            this.f33716d.clear();
            if (bundle.containsKey(NotificationCompat.EXTRA_MESSAGING_STYLE_USER)) {
                this.f33718f = Person.fromBundle(bundle.getBundle(NotificationCompat.EXTRA_MESSAGING_STYLE_USER));
            } else {
                this.f33718f = new Person.Builder().setName(bundle.getString(NotificationCompat.EXTRA_SELF_DISPLAY_NAME)).build();
            }
            CharSequence charSequence = bundle.getCharSequence(NotificationCompat.EXTRA_CONVERSATION_TITLE);
            this.f33719g = charSequence;
            if (charSequence == null) {
                this.f33719g = bundle.getCharSequence(NotificationCompat.EXTRA_HIDDEN_CONVERSATION_TITLE);
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray(NotificationCompat.EXTRA_MESSAGES);
            if (parcelableArray != null) {
                this.f33716d.addAll(Message.m57707c(parcelableArray));
            }
            Parcelable[] parcelableArray2 = bundle.getParcelableArray(NotificationCompat.EXTRA_HISTORIC_MESSAGES);
            if (parcelableArray2 != null) {
                this.f33717e.addAll(Message.m57707c(parcelableArray2));
            }
            if (bundle.containsKey(NotificationCompat.EXTRA_IS_GROUP_CONVERSATION)) {
                this.f33720h = Boolean.valueOf(bundle.getBoolean(NotificationCompat.EXTRA_IS_GROUP_CONVERSATION));
            }
        }

        @NonNull
        public MessagingStyle setConversationTitle(@Nullable CharSequence charSequence) {
            this.f33719g = charSequence;
            return this;
        }

        @NonNull
        public MessagingStyle setGroupConversation(boolean z) {
            this.f33720h = Boolean.valueOf(z);
            return this;
        }

        @Deprecated
        public MessagingStyle(@NonNull CharSequence charSequence) {
            this.f33718f = new Person.Builder().setName(charSequence).build();
        }

        /* loaded from: classes2.dex */
        public static final class Message {

            /* renamed from: a */
            public final CharSequence f33721a;

            /* renamed from: b */
            public final long f33722b;

            /* renamed from: c */
            public final Person f33723c;

            /* renamed from: d */
            public Bundle f33724d;

            /* renamed from: e */
            public String f33725e;

            /* renamed from: f */
            public Uri f33726f;

            /* renamed from: androidx.core.app.NotificationCompat$MessagingStyle$Message$a */
            /* loaded from: classes2.dex */
            public static class C3868a {
                @DoNotInline
                /* renamed from: a */
                public static Notification.MessagingStyle.Message m57704a(CharSequence charSequence, long j, CharSequence charSequence2) {
                    return new Notification.MessagingStyle.Message(charSequence, j, charSequence2);
                }

                @DoNotInline
                /* renamed from: b */
                public static Notification.MessagingStyle.Message m57703b(Notification.MessagingStyle.Message message, String str, Uri uri) {
                    return message.setData(str, uri);
                }
            }

            /* renamed from: androidx.core.app.NotificationCompat$MessagingStyle$Message$b */
            /* loaded from: classes2.dex */
            public static class C3869b {
                @DoNotInline
                /* renamed from: a */
                public static Notification.MessagingStyle.Message m57702a(CharSequence charSequence, long j, android.app.Person person) {
                    return new Notification.MessagingStyle.Message(charSequence, j, person);
                }
            }

            public Message(@Nullable CharSequence charSequence, long j, @Nullable Person person) {
                this.f33724d = new Bundle();
                this.f33721a = charSequence;
                this.f33722b = j;
                this.f33723c = person;
            }

            /* renamed from: a */
            public static Bundle[] m57709a(List list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    bundleArr[i] = ((Message) list.get(i)).m57705e();
                }
                return bundleArr;
            }

            /* renamed from: b */
            public static Message m57708b(Bundle bundle) {
                Person person;
                try {
                    if (bundle.containsKey(TextBundle.TEXT_ENTRY) && bundle.containsKey("time")) {
                        if (bundle.containsKey("person")) {
                            person = Person.fromBundle(bundle.getBundle("person"));
                        } else if (bundle.containsKey("sender_person") && Build.VERSION.SDK_INT >= 28) {
                            person = Person.fromAndroidPerson(AbstractC19380cJ0.m51706a(bundle.getParcelable("sender_person")));
                        } else if (bundle.containsKey("sender")) {
                            person = new Person.Builder().setName(bundle.getCharSequence("sender")).build();
                        } else {
                            person = null;
                        }
                        Message message = new Message(bundle.getCharSequence(TextBundle.TEXT_ENTRY), bundle.getLong("time"), person);
                        if (bundle.containsKey("type") && bundle.containsKey("uri")) {
                            message.setData(bundle.getString("type"), (Uri) bundle.getParcelable("uri"));
                        }
                        if (bundle.containsKey("extras")) {
                            message.getExtras().putAll(bundle.getBundle("extras"));
                        }
                        return message;
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }

            /* renamed from: c */
            public static List m57707c(Parcelable[] parcelableArr) {
                Message m57708b;
                ArrayList arrayList = new ArrayList(parcelableArr.length);
                for (Parcelable parcelable : parcelableArr) {
                    if ((parcelable instanceof Bundle) && (m57708b = m57708b((Bundle) parcelable)) != null) {
                        arrayList.add(m57708b);
                    }
                }
                return arrayList;
            }

            /* renamed from: d */
            public Notification.MessagingStyle.Message m57706d() {
                Notification.MessagingStyle.Message m57704a;
                Person person = getPerson();
                CharSequence charSequence = null;
                android.app.Person person2 = null;
                if (Build.VERSION.SDK_INT >= 28) {
                    CharSequence text = getText();
                    long timestamp = getTimestamp();
                    if (person != null) {
                        person2 = person.toAndroidPerson();
                    }
                    m57704a = C3869b.m57702a(text, timestamp, person2);
                } else {
                    CharSequence text2 = getText();
                    long timestamp2 = getTimestamp();
                    if (person != null) {
                        charSequence = person.getName();
                    }
                    m57704a = C3868a.m57704a(text2, timestamp2, charSequence);
                }
                if (getDataMimeType() != null) {
                    C3868a.m57703b(m57704a, getDataMimeType(), getDataUri());
                }
                return m57704a;
            }

            /* renamed from: e */
            public final Bundle m57705e() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.f33721a;
                if (charSequence != null) {
                    bundle.putCharSequence(TextBundle.TEXT_ENTRY, charSequence);
                }
                bundle.putLong("time", this.f33722b);
                Person person = this.f33723c;
                if (person != null) {
                    bundle.putCharSequence("sender", person.getName());
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable("sender_person", this.f33723c.toAndroidPerson());
                    } else {
                        bundle.putBundle("person", this.f33723c.toBundle());
                    }
                }
                String str = this.f33725e;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.f33726f;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = this.f33724d;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                return bundle;
            }

            @Nullable
            public String getDataMimeType() {
                return this.f33725e;
            }

            @Nullable
            public Uri getDataUri() {
                return this.f33726f;
            }

            @NonNull
            public Bundle getExtras() {
                return this.f33724d;
            }

            @Nullable
            public Person getPerson() {
                return this.f33723c;
            }

            @Nullable
            @Deprecated
            public CharSequence getSender() {
                Person person = this.f33723c;
                if (person == null) {
                    return null;
                }
                return person.getName();
            }

            @Nullable
            public CharSequence getText() {
                return this.f33721a;
            }

            public long getTimestamp() {
                return this.f33722b;
            }

            @NonNull
            public Message setData(@Nullable String str, @Nullable Uri uri) {
                this.f33725e = str;
                this.f33726f = uri;
                return this;
            }

            @Deprecated
            public Message(@Nullable CharSequence charSequence, long j, @Nullable CharSequence charSequence2) {
                this(charSequence, j, new Person.Builder().setName(charSequence2).build());
            }
        }

        @NonNull
        public MessagingStyle addMessage(@Nullable CharSequence charSequence, long j, @Nullable Person person) {
            addMessage(new Message(charSequence, j, person));
            return this;
        }

        @NonNull
        public MessagingStyle addMessage(@Nullable Message message) {
            if (message != null) {
                this.f33716d.add(message);
                if (this.f33716d.size() > 25) {
                    this.f33716d.remove(0);
                }
            }
            return this;
        }

        public MessagingStyle(@NonNull Person person) {
            if (!TextUtils.isEmpty(person.getName())) {
                this.f33718f = person;
                return;
            }
            throw new IllegalArgumentException("User's name must not be empty.");
        }
    }
}