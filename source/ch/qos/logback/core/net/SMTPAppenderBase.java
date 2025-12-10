package ch.qos.logback.core.net;

import androidx.work.PeriodicWorkRequest;
import ch.qos.logback.core.AppenderBase;
import ch.qos.logback.core.Layout;
import ch.qos.logback.core.boolex.EvaluationException;
import ch.qos.logback.core.boolex.EventEvaluator;
import ch.qos.logback.core.helpers.CyclicBuffer;
import ch.qos.logback.core.pattern.PatternLayoutBase;
import ch.qos.logback.core.sift.DefaultDiscriminator;
import ch.qos.logback.core.sift.Discriminator;
import ch.qos.logback.core.spi.CyclicBufferTracker;
import ch.qos.logback.core.util.ContentTypeUtil;
import ch.qos.logback.core.util.OptionHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/* loaded from: classes.dex */
public abstract class SMTPAppenderBase<E> extends AppenderBase<E> {

    /* renamed from: v */
    public static InternetAddress[] f39867v = new InternetAddress[0];
    protected CyclicBufferTracker<E> cbTracker;
    protected EventEvaluator<E> eventEvaluator;

    /* renamed from: j */
    public String f39871j;

    /* renamed from: l */
    public String f39873l;
    protected Layout<E> layout;

    /* renamed from: p */
    public String f39877p;

    /* renamed from: q */
    public String f39878q;

    /* renamed from: r */
    public String f39879r;
    protected Session session;
    protected Layout<E> subjectLayout;

    /* renamed from: g */
    public long f39868g = 0;

    /* renamed from: h */
    public long f39869h = PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;

    /* renamed from: i */
    public List f39870i = new ArrayList();

    /* renamed from: k */
    public String f39872k = null;

    /* renamed from: m */
    public int f39874m = 25;

    /* renamed from: n */
    public boolean f39875n = false;

    /* renamed from: o */
    public boolean f39876o = false;

    /* renamed from: s */
    public boolean f39880s = true;

    /* renamed from: t */
    public String f39881t = "UTF-8";
    protected Discriminator<E> discriminator = new DefaultDiscriminator();

    /* renamed from: u */
    public int f39882u = 0;

    /* renamed from: ch.qos.logback.core.net.SMTPAppenderBase$a */
    /* loaded from: classes.dex */
    public class RunnableC5476a implements Runnable {

        /* renamed from: a */
        public final CyclicBuffer f39883a;

        /* renamed from: b */
        public final Object f39884b;

        public RunnableC5476a(CyclicBuffer cyclicBuffer, Object obj) {
            this.f39883a = cyclicBuffer;
            this.f39884b = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            SMTPAppenderBase.this.sendBuffer(this.f39883a, this.f39884b);
        }
    }

    public void addTo(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Null or empty <to> property");
        }
        PatternLayoutBase<E> makeNewToPatternLayout = makeNewToPatternLayout(str.trim());
        makeNewToPatternLayout.setContext(this.context);
        makeNewToPatternLayout.start();
        this.f39870i.add(makeNewToPatternLayout);
    }

    @Override // ch.qos.logback.core.AppenderBase
    public void append(E e) {
        if (checkEntryConditions()) {
            String discriminatingValue = this.discriminator.getDiscriminatingValue(e);
            long currentTimeMillis = System.currentTimeMillis();
            CyclicBuffer<E> orCreate = this.cbTracker.getOrCreate(discriminatingValue, currentTimeMillis);
            subAppend(orCreate, e);
            try {
                if (this.eventEvaluator.evaluate(e)) {
                    CyclicBuffer<E> cyclicBuffer = new CyclicBuffer<>(orCreate);
                    orCreate.clear();
                    if (this.f39880s) {
                        this.context.getScheduledExecutorService().execute(new RunnableC5476a(cyclicBuffer, e));
                    } else {
                        sendBuffer(cyclicBuffer, e);
                    }
                }
            } catch (EvaluationException e2) {
                int i = this.f39882u + 1;
                this.f39882u = i;
                if (i < 4) {
                    addError("SMTPAppender's EventEvaluator threw an Exception-", e2);
                }
            }
            if (eventMarksEndOfLife(e)) {
                this.cbTracker.endOfLife(discriminatingValue);
            }
            this.cbTracker.removeStaleComponents(currentTimeMillis);
            if (this.f39868g + this.f39869h < currentTimeMillis) {
                addInfo("SMTPAppender [" + this.name + "] is tracking [" + this.cbTracker.getComponentCount() + "] buffers");
                this.f39868g = currentTimeMillis;
                long j = this.f39869h;
                if (j < 1228800000) {
                    this.f39869h = j * 4;
                }
            }
        }
    }

    /* renamed from: b */
    public final Session m51456b() {
        LoginAuthenticator loginAuthenticator;
        Properties properties = new Properties(OptionHelper.getSystemProperties());
        String str = this.f39873l;
        if (str != null) {
            properties.put("mail.smtp.host", str);
        }
        properties.put("mail.smtp.port", Integer.toString(this.f39874m));
        String str2 = this.f39879r;
        if (str2 != null) {
            properties.put("mail.smtp.localhost", str2);
        }
        if (this.f39877p != null) {
            loginAuthenticator = new LoginAuthenticator(this.f39877p, this.f39878q);
            properties.put("mail.smtp.auth", "true");
        } else {
            loginAuthenticator = null;
        }
        if (isSTARTTLS() && isSSL()) {
            addError("Both SSL and StartTLS cannot be enabled simultaneously");
        } else {
            if (isSTARTTLS()) {
                properties.put("mail.smtp.starttls.enable", "true");
                properties.put("mail.transport.protocol", "true");
            }
            if (isSSL()) {
                properties.put("mail.smtp.ssl.enable", "true");
            }
        }
        return Session.getInstance(properties, loginAuthenticator);
    }

    public boolean checkEntryConditions() {
        StringBuilder sb;
        String str;
        if (!this.started) {
            sb = new StringBuilder();
            sb.append("Attempting to append to a non-started appender: ");
            str = getName();
        } else if (this.eventEvaluator == null) {
            sb = new StringBuilder();
            sb.append("No EventEvaluator is set for appender [");
            sb.append(this.name);
            str = "].";
        } else if (this.layout != null) {
            return true;
        } else {
            sb = new StringBuilder();
            sb.append("No layout set for appender named [");
            sb.append(this.name);
            str = "]. For more information, please visit http://logback.qos.ch/codes.html#smtp_no_layout";
        }
        sb.append(str);
        addError(sb.toString());
        return false;
    }

    /* renamed from: d */
    public InternetAddress m51455d(String str) {
        try {
            return new InternetAddress(str);
        } catch (AddressException e) {
            addError("Could not parse address [" + str + "].", e);
            return null;
        }
    }

    public abstract boolean eventMarksEndOfLife(E e);

    public abstract void fillBuffer(CyclicBuffer<E> cyclicBuffer, StringBuffer stringBuffer);

    /* renamed from: g */
    public final List m51454g(Object obj) {
        int size = this.f39870i.size();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            try {
                String doLayout = ((PatternLayoutBase) this.f39870i.get(i)).doLayout(obj);
                if (doLayout != null && doLayout.length() != 0) {
                    arrayList.addAll(Arrays.asList(InternetAddress.parse(doLayout, true)));
                }
            } catch (AddressException e) {
                addError("Could not parse email address for [" + this.f39870i.get(i) + "] for event [" + obj + "]", e);
            }
        }
        return arrayList;
    }

    public String getCharsetEncoding() {
        return this.f39881t;
    }

    public CyclicBufferTracker<E> getCyclicBufferTracker() {
        return this.cbTracker;
    }

    public Discriminator<E> getDiscriminator() {
        return this.discriminator;
    }

    public String getFrom() {
        return this.f39871j;
    }

    public Layout<E> getLayout() {
        return this.layout;
    }

    public String getLocalhost() {
        return this.f39879r;
    }

    public String getPassword() {
        return this.f39878q;
    }

    public String getSMTPHost() {
        return getSmtpHost();
    }

    public int getSMTPPort() {
        return getSmtpPort();
    }

    public String getSmtpHost() {
        return this.f39873l;
    }

    public int getSmtpPort() {
        return this.f39874m;
    }

    public String getSubject() {
        return this.f39872k;
    }

    public List<String> getToAsListOfString() {
        ArrayList arrayList = new ArrayList();
        for (PatternLayoutBase patternLayoutBase : this.f39870i) {
            arrayList.add(patternLayoutBase.getPattern());
        }
        return arrayList;
    }

    public List<PatternLayoutBase<E>> getToList() {
        return this.f39870i;
    }

    public String getUsername() {
        return this.f39877p;
    }

    public boolean isAsynchronousSending() {
        return this.f39880s;
    }

    public boolean isSSL() {
        return this.f39876o;
    }

    public boolean isSTARTTLS() {
        return this.f39875n;
    }

    public abstract PatternLayoutBase<E> makeNewToPatternLayout(String str);

    public abstract Layout<E> makeSubjectLayout(String str);

    public void sendBuffer(CyclicBuffer<E> cyclicBuffer, E e) {
        try {
            MimeBodyPart mimeBodyPart = new MimeBodyPart();
            StringBuffer stringBuffer = new StringBuffer();
            String fileHeader = this.layout.getFileHeader();
            if (fileHeader != null) {
                stringBuffer.append(fileHeader);
            }
            String presentationHeader = this.layout.getPresentationHeader();
            if (presentationHeader != null) {
                stringBuffer.append(presentationHeader);
            }
            fillBuffer(cyclicBuffer, stringBuffer);
            String presentationFooter = this.layout.getPresentationFooter();
            if (presentationFooter != null) {
                stringBuffer.append(presentationFooter);
            }
            String fileFooter = this.layout.getFileFooter();
            if (fileFooter != null) {
                stringBuffer.append(fileFooter);
            }
            String str = "Undefined subject";
            Layout<E> layout = this.subjectLayout;
            if (layout != null) {
                str = layout.doLayout(e);
                int indexOf = str != null ? str.indexOf(10) : -1;
                if (indexOf > -1) {
                    str = str.substring(0, indexOf);
                }
            }
            MimeMessage mimeMessage = new MimeMessage(this.session);
            String str2 = this.f39871j;
            if (str2 != null) {
                mimeMessage.setFrom(m51455d(str2));
            } else {
                mimeMessage.setFrom();
            }
            mimeMessage.setSubject(str, this.f39881t);
            List m51454g = m51454g(e);
            if (m51454g.isEmpty()) {
                addInfo("Empty destination address. Aborting email transmission");
                return;
            }
            InternetAddress[] internetAddressArr = (InternetAddress[]) m51454g.toArray(f39867v);
            mimeMessage.setRecipients(Message.RecipientType.TO, internetAddressArr);
            String contentType = this.layout.getContentType();
            if (ContentTypeUtil.isTextual(contentType)) {
                mimeBodyPart.setText(stringBuffer.toString(), this.f39881t, ContentTypeUtil.getSubType(contentType));
            } else {
                mimeBodyPart.setContent(stringBuffer.toString(), this.layout.getContentType());
            }
            MimeMultipart mimeMultipart = new MimeMultipart();
            mimeMultipart.addBodyPart(mimeBodyPart);
            mimeMessage.setContent(mimeMultipart);
            updateMimeMsg(mimeMessage, cyclicBuffer, e);
            mimeMessage.setSentDate(new Date());
            addInfo("About to send out SMTP message \"" + str + "\" to " + Arrays.toString(internetAddressArr));
            Transport.send(mimeMessage);
        } catch (Exception e2) {
            addError("Error occurred while sending e-mail notification.", e2);
        }
    }

    public void setAsynchronousSending(boolean z) {
        this.f39880s = z;
    }

    public void setCharsetEncoding(String str) {
        this.f39881t = str;
    }

    public void setCyclicBufferTracker(CyclicBufferTracker<E> cyclicBufferTracker) {
        this.cbTracker = cyclicBufferTracker;
    }

    public void setDiscriminator(Discriminator<E> discriminator) {
        this.discriminator = discriminator;
    }

    public void setEvaluator(EventEvaluator<E> eventEvaluator) {
        this.eventEvaluator = eventEvaluator;
    }

    public void setFrom(String str) {
        this.f39871j = str;
    }

    public void setLayout(Layout<E> layout) {
        this.layout = layout;
    }

    public void setLocalhost(String str) {
        this.f39879r = str;
    }

    public void setPassword(String str) {
        this.f39878q = str;
    }

    public void setSMTPHost(String str) {
        setSmtpHost(str);
    }

    public void setSMTPPort(int i) {
        setSmtpPort(i);
    }

    public void setSSL(boolean z) {
        this.f39876o = z;
    }

    public void setSTARTTLS(boolean z) {
        this.f39875n = z;
    }

    public void setSmtpHost(String str) {
        this.f39873l = str;
    }

    public void setSmtpPort(int i) {
        this.f39874m = i;
    }

    public void setSubject(String str) {
        this.f39872k = str;
    }

    public void setUsername(String str) {
        this.f39877p = str;
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        if (this.cbTracker == null) {
            this.cbTracker = new CyclicBufferTracker<>();
        }
        Session m51456b = m51456b();
        this.session = m51456b;
        if (m51456b == null) {
            addError("Failed to obtain javax.mail.Session. Cannot start.");
            return;
        }
        this.subjectLayout = makeSubjectLayout(this.f39872k);
        this.started = true;
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public synchronized void stop() {
        this.started = false;
    }

    public abstract void subAppend(CyclicBuffer<E> cyclicBuffer, E e);

    public void updateMimeMsg(MimeMessage mimeMessage, CyclicBuffer<E> cyclicBuffer, E e) {
    }
}
