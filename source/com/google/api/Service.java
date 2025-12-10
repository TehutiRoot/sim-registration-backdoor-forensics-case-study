package com.google.api;

import com.google.api.Authentication;
import com.google.api.Backend;
import com.google.api.Billing;
import com.google.api.Context;
import com.google.api.Control;
import com.google.api.Documentation;
import com.google.api.Endpoint;
import com.google.api.Http;
import com.google.api.LogDescriptor;
import com.google.api.Logging;
import com.google.api.MetricDescriptor;
import com.google.api.MonitoredResourceDescriptor;
import com.google.api.Monitoring;
import com.google.api.Quota;
import com.google.api.SourceInfo;
import com.google.api.SystemParameters;
import com.google.api.Usage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Api;
import com.google.protobuf.ApiOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Enum;
import com.google.protobuf.EnumOrBuilder;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.google.protobuf.Type;
import com.google.protobuf.TypeOrBuilder;
import com.google.protobuf.UInt32Value;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class Service extends GeneratedMessageLite<Service, Builder> implements ServiceOrBuilder {
    public static final int APIS_FIELD_NUMBER = 3;
    public static final int AUTHENTICATION_FIELD_NUMBER = 11;
    public static final int BACKEND_FIELD_NUMBER = 8;
    public static final int BILLING_FIELD_NUMBER = 26;
    public static final int CONFIG_VERSION_FIELD_NUMBER = 20;
    public static final int CONTEXT_FIELD_NUMBER = 12;
    public static final int CONTROL_FIELD_NUMBER = 21;
    private static final Service DEFAULT_INSTANCE;
    public static final int DOCUMENTATION_FIELD_NUMBER = 6;
    public static final int ENDPOINTS_FIELD_NUMBER = 18;
    public static final int ENUMS_FIELD_NUMBER = 5;
    public static final int HTTP_FIELD_NUMBER = 9;
    public static final int ID_FIELD_NUMBER = 33;
    public static final int LOGGING_FIELD_NUMBER = 27;
    public static final int LOGS_FIELD_NUMBER = 23;
    public static final int METRICS_FIELD_NUMBER = 24;
    public static final int MONITORED_RESOURCES_FIELD_NUMBER = 25;
    public static final int MONITORING_FIELD_NUMBER = 28;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<Service> PARSER = null;
    public static final int PRODUCER_PROJECT_ID_FIELD_NUMBER = 22;
    public static final int QUOTA_FIELD_NUMBER = 10;
    public static final int SOURCE_INFO_FIELD_NUMBER = 37;
    public static final int SYSTEM_PARAMETERS_FIELD_NUMBER = 29;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int TYPES_FIELD_NUMBER = 4;
    public static final int USAGE_FIELD_NUMBER = 15;
    private Authentication authentication_;
    private Backend backend_;
    private Billing billing_;
    private UInt32Value configVersion_;
    private Context context_;
    private Control control_;
    private Documentation documentation_;
    private Http http_;
    private Logging logging_;
    private Monitoring monitoring_;
    private Quota quota_;
    private SourceInfo sourceInfo_;
    private SystemParameters systemParameters_;
    private Usage usage_;
    private String name_ = "";
    private String id_ = "";
    private String title_ = "";
    private String producerProjectId_ = "";
    private Internal.ProtobufList<Api> apis_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<Type> types_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<Enum> enums_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<Endpoint> endpoints_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<LogDescriptor> logs_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<MetricDescriptor> metrics_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<MonitoredResourceDescriptor> monitoredResources_ = GeneratedMessageLite.emptyProtobufList();

    /* loaded from: classes4.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Service, Builder> implements ServiceOrBuilder {
        public /* synthetic */ Builder(C7251a c7251a) {
            this();
        }

        public Builder addAllApis(Iterable<? extends Api> iterable) {
            copyOnWrite();
            ((Service) this.instance).m41993u1(iterable);
            return this;
        }

        public Builder addAllEndpoints(Iterable<? extends Endpoint> iterable) {
            copyOnWrite();
            ((Service) this.instance).m41990v1(iterable);
            return this;
        }

        public Builder addAllEnums(Iterable<? extends Enum> iterable) {
            copyOnWrite();
            ((Service) this.instance).m41987w1(iterable);
            return this;
        }

        public Builder addAllLogs(Iterable<? extends LogDescriptor> iterable) {
            copyOnWrite();
            ((Service) this.instance).m41984x1(iterable);
            return this;
        }

        public Builder addAllMetrics(Iterable<? extends MetricDescriptor> iterable) {
            copyOnWrite();
            ((Service) this.instance).m41981y1(iterable);
            return this;
        }

        public Builder addAllMonitoredResources(Iterable<? extends MonitoredResourceDescriptor> iterable) {
            copyOnWrite();
            ((Service) this.instance).m41978z1(iterable);
            return this;
        }

        public Builder addAllTypes(Iterable<? extends Type> iterable) {
            copyOnWrite();
            ((Service) this.instance).m42175A1(iterable);
            return this;
        }

        public Builder addApis(Api api) {
            copyOnWrite();
            ((Service) this.instance).m42167C1(api);
            return this;
        }

        public Builder addEndpoints(Endpoint endpoint) {
            copyOnWrite();
            ((Service) this.instance).m42159E1(endpoint);
            return this;
        }

        public Builder addEnums(Enum r2) {
            copyOnWrite();
            ((Service) this.instance).m42151G1(r2);
            return this;
        }

        public Builder addLogs(LogDescriptor logDescriptor) {
            copyOnWrite();
            ((Service) this.instance).m42143I1(logDescriptor);
            return this;
        }

        public Builder addMetrics(MetricDescriptor metricDescriptor) {
            copyOnWrite();
            ((Service) this.instance).m42135K1(metricDescriptor);
            return this;
        }

        public Builder addMonitoredResources(MonitoredResourceDescriptor monitoredResourceDescriptor) {
            copyOnWrite();
            ((Service) this.instance).m42127M1(monitoredResourceDescriptor);
            return this;
        }

        public Builder addTypes(Type type) {
            copyOnWrite();
            ((Service) this.instance).m42119O1(type);
            return this;
        }

        public Builder clearApis() {
            copyOnWrite();
            ((Service) this.instance).m42115P1();
            return this;
        }

        public Builder clearAuthentication() {
            copyOnWrite();
            ((Service) this.instance).m42111Q1();
            return this;
        }

        public Builder clearBackend() {
            copyOnWrite();
            ((Service) this.instance).m42107R1();
            return this;
        }

        public Builder clearBilling() {
            copyOnWrite();
            ((Service) this.instance).m42103S1();
            return this;
        }

        public Builder clearConfigVersion() {
            copyOnWrite();
            ((Service) this.instance).m42099T1();
            return this;
        }

        public Builder clearContext() {
            copyOnWrite();
            ((Service) this.instance).m42095U1();
            return this;
        }

        public Builder clearControl() {
            copyOnWrite();
            ((Service) this.instance).m42091V1();
            return this;
        }

        public Builder clearDocumentation() {
            copyOnWrite();
            ((Service) this.instance).m42087W1();
            return this;
        }

        public Builder clearEndpoints() {
            copyOnWrite();
            ((Service) this.instance).m42083X1();
            return this;
        }

        public Builder clearEnums() {
            copyOnWrite();
            ((Service) this.instance).m42079Y1();
            return this;
        }

        public Builder clearHttp() {
            copyOnWrite();
            ((Service) this.instance).m42075Z1();
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((Service) this.instance).m42071a2();
            return this;
        }

        public Builder clearLogging() {
            copyOnWrite();
            ((Service) this.instance).m42067b2();
            return this;
        }

        public Builder clearLogs() {
            copyOnWrite();
            ((Service) this.instance).m42063c2();
            return this;
        }

        public Builder clearMetrics() {
            copyOnWrite();
            ((Service) this.instance).m42059d2();
            return this;
        }

        public Builder clearMonitoredResources() {
            copyOnWrite();
            ((Service) this.instance).m42055e2();
            return this;
        }

        public Builder clearMonitoring() {
            copyOnWrite();
            ((Service) this.instance).m42051f2();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((Service) this.instance).m42047g2();
            return this;
        }

        public Builder clearProducerProjectId() {
            copyOnWrite();
            ((Service) this.instance).m42043h2();
            return this;
        }

        public Builder clearQuota() {
            copyOnWrite();
            ((Service) this.instance).m42039i2();
            return this;
        }

        public Builder clearSourceInfo() {
            copyOnWrite();
            ((Service) this.instance).m42035j2();
            return this;
        }

        public Builder clearSystemParameters() {
            copyOnWrite();
            ((Service) this.instance).m42031k2();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((Service) this.instance).m42027l2();
            return this;
        }

        public Builder clearTypes() {
            copyOnWrite();
            ((Service) this.instance).m42023m2();
            return this;
        }

        public Builder clearUsage() {
            copyOnWrite();
            ((Service) this.instance).m42019n2();
            return this;
        }

        @Override // com.google.api.ServiceOrBuilder
        public Api getApis(int i) {
            return ((Service) this.instance).getApis(i);
        }

        @Override // com.google.api.ServiceOrBuilder
        public int getApisCount() {
            return ((Service) this.instance).getApisCount();
        }

        @Override // com.google.api.ServiceOrBuilder
        public List<Api> getApisList() {
            return Collections.unmodifiableList(((Service) this.instance).getApisList());
        }

        @Override // com.google.api.ServiceOrBuilder
        public Authentication getAuthentication() {
            return ((Service) this.instance).getAuthentication();
        }

        @Override // com.google.api.ServiceOrBuilder
        public Backend getBackend() {
            return ((Service) this.instance).getBackend();
        }

        @Override // com.google.api.ServiceOrBuilder
        public Billing getBilling() {
            return ((Service) this.instance).getBilling();
        }

        @Override // com.google.api.ServiceOrBuilder
        public UInt32Value getConfigVersion() {
            return ((Service) this.instance).getConfigVersion();
        }

        @Override // com.google.api.ServiceOrBuilder
        public Context getContext() {
            return ((Service) this.instance).getContext();
        }

        @Override // com.google.api.ServiceOrBuilder
        public Control getControl() {
            return ((Service) this.instance).getControl();
        }

        @Override // com.google.api.ServiceOrBuilder
        public Documentation getDocumentation() {
            return ((Service) this.instance).getDocumentation();
        }

        @Override // com.google.api.ServiceOrBuilder
        public Endpoint getEndpoints(int i) {
            return ((Service) this.instance).getEndpoints(i);
        }

        @Override // com.google.api.ServiceOrBuilder
        public int getEndpointsCount() {
            return ((Service) this.instance).getEndpointsCount();
        }

        @Override // com.google.api.ServiceOrBuilder
        public List<Endpoint> getEndpointsList() {
            return Collections.unmodifiableList(((Service) this.instance).getEndpointsList());
        }

        @Override // com.google.api.ServiceOrBuilder
        public Enum getEnums(int i) {
            return ((Service) this.instance).getEnums(i);
        }

        @Override // com.google.api.ServiceOrBuilder
        public int getEnumsCount() {
            return ((Service) this.instance).getEnumsCount();
        }

        @Override // com.google.api.ServiceOrBuilder
        public List<Enum> getEnumsList() {
            return Collections.unmodifiableList(((Service) this.instance).getEnumsList());
        }

        @Override // com.google.api.ServiceOrBuilder
        public Http getHttp() {
            return ((Service) this.instance).getHttp();
        }

        @Override // com.google.api.ServiceOrBuilder
        public String getId() {
            return ((Service) this.instance).getId();
        }

        @Override // com.google.api.ServiceOrBuilder
        public ByteString getIdBytes() {
            return ((Service) this.instance).getIdBytes();
        }

        @Override // com.google.api.ServiceOrBuilder
        public Logging getLogging() {
            return ((Service) this.instance).getLogging();
        }

        @Override // com.google.api.ServiceOrBuilder
        public LogDescriptor getLogs(int i) {
            return ((Service) this.instance).getLogs(i);
        }

        @Override // com.google.api.ServiceOrBuilder
        public int getLogsCount() {
            return ((Service) this.instance).getLogsCount();
        }

        @Override // com.google.api.ServiceOrBuilder
        public List<LogDescriptor> getLogsList() {
            return Collections.unmodifiableList(((Service) this.instance).getLogsList());
        }

        @Override // com.google.api.ServiceOrBuilder
        public MetricDescriptor getMetrics(int i) {
            return ((Service) this.instance).getMetrics(i);
        }

        @Override // com.google.api.ServiceOrBuilder
        public int getMetricsCount() {
            return ((Service) this.instance).getMetricsCount();
        }

        @Override // com.google.api.ServiceOrBuilder
        public List<MetricDescriptor> getMetricsList() {
            return Collections.unmodifiableList(((Service) this.instance).getMetricsList());
        }

        @Override // com.google.api.ServiceOrBuilder
        public MonitoredResourceDescriptor getMonitoredResources(int i) {
            return ((Service) this.instance).getMonitoredResources(i);
        }

        @Override // com.google.api.ServiceOrBuilder
        public int getMonitoredResourcesCount() {
            return ((Service) this.instance).getMonitoredResourcesCount();
        }

        @Override // com.google.api.ServiceOrBuilder
        public List<MonitoredResourceDescriptor> getMonitoredResourcesList() {
            return Collections.unmodifiableList(((Service) this.instance).getMonitoredResourcesList());
        }

        @Override // com.google.api.ServiceOrBuilder
        public Monitoring getMonitoring() {
            return ((Service) this.instance).getMonitoring();
        }

        @Override // com.google.api.ServiceOrBuilder
        public String getName() {
            return ((Service) this.instance).getName();
        }

        @Override // com.google.api.ServiceOrBuilder
        public ByteString getNameBytes() {
            return ((Service) this.instance).getNameBytes();
        }

        @Override // com.google.api.ServiceOrBuilder
        public String getProducerProjectId() {
            return ((Service) this.instance).getProducerProjectId();
        }

        @Override // com.google.api.ServiceOrBuilder
        public ByteString getProducerProjectIdBytes() {
            return ((Service) this.instance).getProducerProjectIdBytes();
        }

        @Override // com.google.api.ServiceOrBuilder
        public Quota getQuota() {
            return ((Service) this.instance).getQuota();
        }

        @Override // com.google.api.ServiceOrBuilder
        public SourceInfo getSourceInfo() {
            return ((Service) this.instance).getSourceInfo();
        }

        @Override // com.google.api.ServiceOrBuilder
        public SystemParameters getSystemParameters() {
            return ((Service) this.instance).getSystemParameters();
        }

        @Override // com.google.api.ServiceOrBuilder
        public String getTitle() {
            return ((Service) this.instance).getTitle();
        }

        @Override // com.google.api.ServiceOrBuilder
        public ByteString getTitleBytes() {
            return ((Service) this.instance).getTitleBytes();
        }

        @Override // com.google.api.ServiceOrBuilder
        public Type getTypes(int i) {
            return ((Service) this.instance).getTypes(i);
        }

        @Override // com.google.api.ServiceOrBuilder
        public int getTypesCount() {
            return ((Service) this.instance).getTypesCount();
        }

        @Override // com.google.api.ServiceOrBuilder
        public List<Type> getTypesList() {
            return Collections.unmodifiableList(((Service) this.instance).getTypesList());
        }

        @Override // com.google.api.ServiceOrBuilder
        public Usage getUsage() {
            return ((Service) this.instance).getUsage();
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasAuthentication() {
            return ((Service) this.instance).hasAuthentication();
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasBackend() {
            return ((Service) this.instance).hasBackend();
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasBilling() {
            return ((Service) this.instance).hasBilling();
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasConfigVersion() {
            return ((Service) this.instance).hasConfigVersion();
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasContext() {
            return ((Service) this.instance).hasContext();
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasControl() {
            return ((Service) this.instance).hasControl();
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasDocumentation() {
            return ((Service) this.instance).hasDocumentation();
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasHttp() {
            return ((Service) this.instance).hasHttp();
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasLogging() {
            return ((Service) this.instance).hasLogging();
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasMonitoring() {
            return ((Service) this.instance).hasMonitoring();
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasQuota() {
            return ((Service) this.instance).hasQuota();
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasSourceInfo() {
            return ((Service) this.instance).hasSourceInfo();
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasSystemParameters() {
            return ((Service) this.instance).hasSystemParameters();
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasUsage() {
            return ((Service) this.instance).hasUsage();
        }

        public Builder mergeAuthentication(Authentication authentication) {
            copyOnWrite();
            ((Service) this.instance).m41989v2(authentication);
            return this;
        }

        public Builder mergeBackend(Backend backend) {
            copyOnWrite();
            ((Service) this.instance).m41986w2(backend);
            return this;
        }

        public Builder mergeBilling(Billing billing) {
            copyOnWrite();
            ((Service) this.instance).m41983x2(billing);
            return this;
        }

        public Builder mergeConfigVersion(UInt32Value uInt32Value) {
            copyOnWrite();
            ((Service) this.instance).m41980y2(uInt32Value);
            return this;
        }

        public Builder mergeContext(Context context) {
            copyOnWrite();
            ((Service) this.instance).m41977z2(context);
            return this;
        }

        public Builder mergeControl(Control control) {
            copyOnWrite();
            ((Service) this.instance).m42174A2(control);
            return this;
        }

        public Builder mergeDocumentation(Documentation documentation) {
            copyOnWrite();
            ((Service) this.instance).m42170B2(documentation);
            return this;
        }

        public Builder mergeHttp(Http http) {
            copyOnWrite();
            ((Service) this.instance).m42166C2(http);
            return this;
        }

        public Builder mergeLogging(Logging logging) {
            copyOnWrite();
            ((Service) this.instance).m42162D2(logging);
            return this;
        }

        public Builder mergeMonitoring(Monitoring monitoring) {
            copyOnWrite();
            ((Service) this.instance).m42158E2(monitoring);
            return this;
        }

        public Builder mergeQuota(Quota quota) {
            copyOnWrite();
            ((Service) this.instance).m42154F2(quota);
            return this;
        }

        public Builder mergeSourceInfo(SourceInfo sourceInfo) {
            copyOnWrite();
            ((Service) this.instance).m42150G2(sourceInfo);
            return this;
        }

        public Builder mergeSystemParameters(SystemParameters systemParameters) {
            copyOnWrite();
            ((Service) this.instance).m42146H2(systemParameters);
            return this;
        }

        public Builder mergeUsage(Usage usage) {
            copyOnWrite();
            ((Service) this.instance).m42142I2(usage);
            return this;
        }

        public Builder removeApis(int i) {
            copyOnWrite();
            ((Service) this.instance).m42138J2(i);
            return this;
        }

        public Builder removeEndpoints(int i) {
            copyOnWrite();
            ((Service) this.instance).m42134K2(i);
            return this;
        }

        public Builder removeEnums(int i) {
            copyOnWrite();
            ((Service) this.instance).m42130L2(i);
            return this;
        }

        public Builder removeLogs(int i) {
            copyOnWrite();
            ((Service) this.instance).m42126M2(i);
            return this;
        }

        public Builder removeMetrics(int i) {
            copyOnWrite();
            ((Service) this.instance).m42122N2(i);
            return this;
        }

        public Builder removeMonitoredResources(int i) {
            copyOnWrite();
            ((Service) this.instance).m42118O2(i);
            return this;
        }

        public Builder removeTypes(int i) {
            copyOnWrite();
            ((Service) this.instance).m42114P2(i);
            return this;
        }

        public Builder setApis(int i, Api api) {
            copyOnWrite();
            ((Service) this.instance).m42110Q2(i, api);
            return this;
        }

        public Builder setAuthentication(Authentication authentication) {
            copyOnWrite();
            ((Service) this.instance).m42106R2(authentication);
            return this;
        }

        public Builder setBackend(Backend backend) {
            copyOnWrite();
            ((Service) this.instance).m42102S2(backend);
            return this;
        }

        public Builder setBilling(Billing billing) {
            copyOnWrite();
            ((Service) this.instance).m42098T2(billing);
            return this;
        }

        public Builder setConfigVersion(UInt32Value uInt32Value) {
            copyOnWrite();
            ((Service) this.instance).m42094U2(uInt32Value);
            return this;
        }

        public Builder setContext(Context context) {
            copyOnWrite();
            ((Service) this.instance).m42090V2(context);
            return this;
        }

        public Builder setControl(Control control) {
            copyOnWrite();
            ((Service) this.instance).m42086W2(control);
            return this;
        }

        public Builder setDocumentation(Documentation documentation) {
            copyOnWrite();
            ((Service) this.instance).m42082X2(documentation);
            return this;
        }

        public Builder setEndpoints(int i, Endpoint endpoint) {
            copyOnWrite();
            ((Service) this.instance).m42078Y2(i, endpoint);
            return this;
        }

        public Builder setEnums(int i, Enum r3) {
            copyOnWrite();
            ((Service) this.instance).m42074Z2(i, r3);
            return this;
        }

        public Builder setHttp(Http http) {
            copyOnWrite();
            ((Service) this.instance).m42070a3(http);
            return this;
        }

        public Builder setId(String str) {
            copyOnWrite();
            ((Service) this.instance).m42066b3(str);
            return this;
        }

        public Builder setIdBytes(ByteString byteString) {
            copyOnWrite();
            ((Service) this.instance).m42062c3(byteString);
            return this;
        }

        public Builder setLogging(Logging logging) {
            copyOnWrite();
            ((Service) this.instance).m42058d3(logging);
            return this;
        }

        public Builder setLogs(int i, LogDescriptor logDescriptor) {
            copyOnWrite();
            ((Service) this.instance).m42054e3(i, logDescriptor);
            return this;
        }

        public Builder setMetrics(int i, MetricDescriptor metricDescriptor) {
            copyOnWrite();
            ((Service) this.instance).m42050f3(i, metricDescriptor);
            return this;
        }

        public Builder setMonitoredResources(int i, MonitoredResourceDescriptor monitoredResourceDescriptor) {
            copyOnWrite();
            ((Service) this.instance).m42046g3(i, monitoredResourceDescriptor);
            return this;
        }

        public Builder setMonitoring(Monitoring monitoring) {
            copyOnWrite();
            ((Service) this.instance).m42042h3(monitoring);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((Service) this.instance).m42038i3(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((Service) this.instance).m42034j3(byteString);
            return this;
        }

        public Builder setProducerProjectId(String str) {
            copyOnWrite();
            ((Service) this.instance).m42030k3(str);
            return this;
        }

        public Builder setProducerProjectIdBytes(ByteString byteString) {
            copyOnWrite();
            ((Service) this.instance).m42026l3(byteString);
            return this;
        }

        public Builder setQuota(Quota quota) {
            copyOnWrite();
            ((Service) this.instance).m42022m3(quota);
            return this;
        }

        public Builder setSourceInfo(SourceInfo sourceInfo) {
            copyOnWrite();
            ((Service) this.instance).m42018n3(sourceInfo);
            return this;
        }

        public Builder setSystemParameters(SystemParameters systemParameters) {
            copyOnWrite();
            ((Service) this.instance).m42014o3(systemParameters);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((Service) this.instance).m42010p3(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((Service) this.instance).m42006q3(byteString);
            return this;
        }

        public Builder setTypes(int i, Type type) {
            copyOnWrite();
            ((Service) this.instance).m42002r3(i, type);
            return this;
        }

        public Builder setUsage(Usage usage) {
            copyOnWrite();
            ((Service) this.instance).m41998s3(usage);
            return this;
        }

        public Builder() {
            super(Service.DEFAULT_INSTANCE);
        }

        public Builder addApis(int i, Api api) {
            copyOnWrite();
            ((Service) this.instance).m42171B1(i, api);
            return this;
        }

        public Builder addEndpoints(int i, Endpoint endpoint) {
            copyOnWrite();
            ((Service) this.instance).m42163D1(i, endpoint);
            return this;
        }

        public Builder addEnums(int i, Enum r3) {
            copyOnWrite();
            ((Service) this.instance).m42155F1(i, r3);
            return this;
        }

        public Builder addLogs(int i, LogDescriptor logDescriptor) {
            copyOnWrite();
            ((Service) this.instance).m42147H1(i, logDescriptor);
            return this;
        }

        public Builder addMetrics(int i, MetricDescriptor metricDescriptor) {
            copyOnWrite();
            ((Service) this.instance).m42139J1(i, metricDescriptor);
            return this;
        }

        public Builder addMonitoredResources(int i, MonitoredResourceDescriptor monitoredResourceDescriptor) {
            copyOnWrite();
            ((Service) this.instance).m42131L1(i, monitoredResourceDescriptor);
            return this;
        }

        public Builder addTypes(int i, Type type) {
            copyOnWrite();
            ((Service) this.instance).m42123N1(i, type);
            return this;
        }

        public Builder setApis(int i, Api.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).m42110Q2(i, builder.build());
            return this;
        }

        public Builder setAuthentication(Authentication.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).m42106R2(builder.build());
            return this;
        }

        public Builder setBackend(Backend.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).m42102S2(builder.build());
            return this;
        }

        public Builder setBilling(Billing.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).m42098T2(builder.build());
            return this;
        }

        public Builder setConfigVersion(UInt32Value.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).m42094U2(builder.build());
            return this;
        }

        public Builder setContext(Context.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).m42090V2(builder.build());
            return this;
        }

        public Builder setControl(Control.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).m42086W2(builder.build());
            return this;
        }

        public Builder setDocumentation(Documentation.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).m42082X2(builder.build());
            return this;
        }

        public Builder setEndpoints(int i, Endpoint.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).m42078Y2(i, builder.build());
            return this;
        }

        public Builder setEnums(int i, Enum.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).m42074Z2(i, builder.build());
            return this;
        }

        public Builder setHttp(Http.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).m42070a3(builder.build());
            return this;
        }

        public Builder setLogging(Logging.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).m42058d3(builder.build());
            return this;
        }

        public Builder setLogs(int i, LogDescriptor.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).m42054e3(i, builder.build());
            return this;
        }

        public Builder setMetrics(int i, MetricDescriptor.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).m42050f3(i, builder.build());
            return this;
        }

        public Builder setMonitoredResources(int i, MonitoredResourceDescriptor.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).m42046g3(i, builder.build());
            return this;
        }

        public Builder setMonitoring(Monitoring.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).m42042h3(builder.build());
            return this;
        }

        public Builder setQuota(Quota.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).m42022m3(builder.build());
            return this;
        }

        public Builder setSourceInfo(SourceInfo.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).m42018n3(builder.build());
            return this;
        }

        public Builder setSystemParameters(SystemParameters.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).m42014o3(builder.build());
            return this;
        }

        public Builder setTypes(int i, Type.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).m42002r3(i, builder.build());
            return this;
        }

        public Builder setUsage(Usage.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).m41998s3(builder.build());
            return this;
        }

        public Builder addApis(Api.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).m42167C1(builder.build());
            return this;
        }

        public Builder addEndpoints(Endpoint.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).m42159E1(builder.build());
            return this;
        }

        public Builder addEnums(Enum.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).m42151G1(builder.build());
            return this;
        }

        public Builder addLogs(LogDescriptor.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).m42143I1(builder.build());
            return this;
        }

        public Builder addMetrics(MetricDescriptor.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).m42135K1(builder.build());
            return this;
        }

        public Builder addMonitoredResources(MonitoredResourceDescriptor.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).m42127M1(builder.build());
            return this;
        }

        public Builder addTypes(Type.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).m42119O1(builder.build());
            return this;
        }

        public Builder addApis(int i, Api.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).m42171B1(i, builder.build());
            return this;
        }

        public Builder addEndpoints(int i, Endpoint.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).m42163D1(i, builder.build());
            return this;
        }

        public Builder addEnums(int i, Enum.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).m42155F1(i, builder.build());
            return this;
        }

        public Builder addLogs(int i, LogDescriptor.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).m42147H1(i, builder.build());
            return this;
        }

        public Builder addMetrics(int i, MetricDescriptor.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).m42139J1(i, builder.build());
            return this;
        }

        public Builder addMonitoredResources(int i, MonitoredResourceDescriptor.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).m42131L1(i, builder.build());
            return this;
        }

        public Builder addTypes(int i, Type.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).m42123N1(i, builder.build());
            return this;
        }
    }

    /* renamed from: com.google.api.Service$a */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C7251a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f51652a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f51652a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f51652a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f51652a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f51652a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f51652a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f51652a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f51652a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        Service service = new Service();
        DEFAULT_INSTANCE = service;
        GeneratedMessageLite.registerDefaultInstance(Service.class, service);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q1 */
    public void m42111Q1() {
        this.authentication_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a2 */
    public void m42071a2() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b3 */
    public void m42066b3(String str) {
        str.getClass();
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c2 */
    public void m42063c2() {
        this.logs_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c3 */
    public void m42062c3(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d2 */
    public void m42059d2() {
        this.metrics_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g2 */
    public void m42047g2() {
        this.name_ = getDefaultInstance().getName();
    }

    public static Service getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i3 */
    public void m42038i3(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j3 */
    public void m42034j3(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Service parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Service) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Service parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Service> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* renamed from: r2 */
    private void m42003r2() {
        Internal.ProtobufList<LogDescriptor> protobufList = this.logs_;
        if (!protobufList.isModifiable()) {
            this.logs_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    /* renamed from: s2 */
    private void m41999s2() {
        Internal.ProtobufList<MetricDescriptor> protobufList = this.metrics_;
        if (!protobufList.isModifiable()) {
            this.metrics_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x1 */
    public void m41984x1(Iterable iterable) {
        m42003r2();
        AbstractMessageLite.addAll(iterable, (List) this.logs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y1 */
    public void m41981y1(Iterable iterable) {
        m41999s2();
        AbstractMessageLite.addAll(iterable, (List) this.metrics_);
    }

    /* renamed from: A1 */
    public final void m42175A1(Iterable iterable) {
        m41992u2();
        AbstractMessageLite.addAll(iterable, (List) this.types_);
    }

    /* renamed from: A2 */
    public final void m42174A2(Control control) {
        control.getClass();
        Control control2 = this.control_;
        if (control2 != null && control2 != Control.getDefaultInstance()) {
            this.control_ = Control.newBuilder(this.control_).mergeFrom((Control.Builder) control).buildPartial();
        } else {
            this.control_ = control;
        }
    }

    /* renamed from: B1 */
    public final void m42171B1(int i, Api api) {
        api.getClass();
        m42015o2();
        this.apis_.add(i, api);
    }

    /* renamed from: B2 */
    public final void m42170B2(Documentation documentation) {
        documentation.getClass();
        Documentation documentation2 = this.documentation_;
        if (documentation2 != null && documentation2 != Documentation.getDefaultInstance()) {
            this.documentation_ = Documentation.newBuilder(this.documentation_).mergeFrom((Documentation.Builder) documentation).buildPartial();
        } else {
            this.documentation_ = documentation;
        }
    }

    /* renamed from: C1 */
    public final void m42167C1(Api api) {
        api.getClass();
        m42015o2();
        this.apis_.add(api);
    }

    /* renamed from: C2 */
    public final void m42166C2(Http http) {
        http.getClass();
        Http http2 = this.http_;
        if (http2 != null && http2 != Http.getDefaultInstance()) {
            this.http_ = Http.newBuilder(this.http_).mergeFrom((Http.Builder) http).buildPartial();
        } else {
            this.http_ = http;
        }
    }

    /* renamed from: D1 */
    public final void m42163D1(int i, Endpoint endpoint) {
        endpoint.getClass();
        m42011p2();
        this.endpoints_.add(i, endpoint);
    }

    /* renamed from: D2 */
    public final void m42162D2(Logging logging) {
        logging.getClass();
        Logging logging2 = this.logging_;
        if (logging2 != null && logging2 != Logging.getDefaultInstance()) {
            this.logging_ = Logging.newBuilder(this.logging_).mergeFrom((Logging.Builder) logging).buildPartial();
        } else {
            this.logging_ = logging;
        }
    }

    /* renamed from: E1 */
    public final void m42159E1(Endpoint endpoint) {
        endpoint.getClass();
        m42011p2();
        this.endpoints_.add(endpoint);
    }

    /* renamed from: E2 */
    public final void m42158E2(Monitoring monitoring) {
        monitoring.getClass();
        Monitoring monitoring2 = this.monitoring_;
        if (monitoring2 != null && monitoring2 != Monitoring.getDefaultInstance()) {
            this.monitoring_ = Monitoring.newBuilder(this.monitoring_).mergeFrom((Monitoring.Builder) monitoring).buildPartial();
        } else {
            this.monitoring_ = monitoring;
        }
    }

    /* renamed from: F1 */
    public final void m42155F1(int i, Enum r3) {
        r3.getClass();
        m42007q2();
        this.enums_.add(i, r3);
    }

    /* renamed from: F2 */
    public final void m42154F2(Quota quota) {
        quota.getClass();
        Quota quota2 = this.quota_;
        if (quota2 != null && quota2 != Quota.getDefaultInstance()) {
            this.quota_ = Quota.newBuilder(this.quota_).mergeFrom((Quota.Builder) quota).buildPartial();
        } else {
            this.quota_ = quota;
        }
    }

    /* renamed from: G1 */
    public final void m42151G1(Enum r2) {
        r2.getClass();
        m42007q2();
        this.enums_.add(r2);
    }

    /* renamed from: G2 */
    public final void m42150G2(SourceInfo sourceInfo) {
        sourceInfo.getClass();
        SourceInfo sourceInfo2 = this.sourceInfo_;
        if (sourceInfo2 != null && sourceInfo2 != SourceInfo.getDefaultInstance()) {
            this.sourceInfo_ = SourceInfo.newBuilder(this.sourceInfo_).mergeFrom((SourceInfo.Builder) sourceInfo).buildPartial();
        } else {
            this.sourceInfo_ = sourceInfo;
        }
    }

    /* renamed from: H1 */
    public final void m42147H1(int i, LogDescriptor logDescriptor) {
        logDescriptor.getClass();
        m42003r2();
        this.logs_.add(i, logDescriptor);
    }

    /* renamed from: H2 */
    public final void m42146H2(SystemParameters systemParameters) {
        systemParameters.getClass();
        SystemParameters systemParameters2 = this.systemParameters_;
        if (systemParameters2 != null && systemParameters2 != SystemParameters.getDefaultInstance()) {
            this.systemParameters_ = SystemParameters.newBuilder(this.systemParameters_).mergeFrom((SystemParameters.Builder) systemParameters).buildPartial();
        } else {
            this.systemParameters_ = systemParameters;
        }
    }

    /* renamed from: I1 */
    public final void m42143I1(LogDescriptor logDescriptor) {
        logDescriptor.getClass();
        m42003r2();
        this.logs_.add(logDescriptor);
    }

    /* renamed from: I2 */
    public final void m42142I2(Usage usage) {
        usage.getClass();
        Usage usage2 = this.usage_;
        if (usage2 != null && usage2 != Usage.getDefaultInstance()) {
            this.usage_ = Usage.newBuilder(this.usage_).mergeFrom((Usage.Builder) usage).buildPartial();
        } else {
            this.usage_ = usage;
        }
    }

    /* renamed from: J1 */
    public final void m42139J1(int i, MetricDescriptor metricDescriptor) {
        metricDescriptor.getClass();
        m41999s2();
        this.metrics_.add(i, metricDescriptor);
    }

    /* renamed from: J2 */
    public final void m42138J2(int i) {
        m42015o2();
        this.apis_.remove(i);
    }

    /* renamed from: K1 */
    public final void m42135K1(MetricDescriptor metricDescriptor) {
        metricDescriptor.getClass();
        m41999s2();
        this.metrics_.add(metricDescriptor);
    }

    /* renamed from: K2 */
    public final void m42134K2(int i) {
        m42011p2();
        this.endpoints_.remove(i);
    }

    /* renamed from: L1 */
    public final void m42131L1(int i, MonitoredResourceDescriptor monitoredResourceDescriptor) {
        monitoredResourceDescriptor.getClass();
        m41995t2();
        this.monitoredResources_.add(i, monitoredResourceDescriptor);
    }

    /* renamed from: L2 */
    public final void m42130L2(int i) {
        m42007q2();
        this.enums_.remove(i);
    }

    /* renamed from: M1 */
    public final void m42127M1(MonitoredResourceDescriptor monitoredResourceDescriptor) {
        monitoredResourceDescriptor.getClass();
        m41995t2();
        this.monitoredResources_.add(monitoredResourceDescriptor);
    }

    /* renamed from: M2 */
    public final void m42126M2(int i) {
        m42003r2();
        this.logs_.remove(i);
    }

    /* renamed from: N1 */
    public final void m42123N1(int i, Type type) {
        type.getClass();
        m41992u2();
        this.types_.add(i, type);
    }

    /* renamed from: N2 */
    public final void m42122N2(int i) {
        m41999s2();
        this.metrics_.remove(i);
    }

    /* renamed from: O1 */
    public final void m42119O1(Type type) {
        type.getClass();
        m41992u2();
        this.types_.add(type);
    }

    /* renamed from: O2 */
    public final void m42118O2(int i) {
        m41995t2();
        this.monitoredResources_.remove(i);
    }

    /* renamed from: P1 */
    public final void m42115P1() {
        this.apis_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* renamed from: P2 */
    public final void m42114P2(int i) {
        m41992u2();
        this.types_.remove(i);
    }

    /* renamed from: Q2 */
    public final void m42110Q2(int i, Api api) {
        api.getClass();
        m42015o2();
        this.apis_.set(i, api);
    }

    /* renamed from: R1 */
    public final void m42107R1() {
        this.backend_ = null;
    }

    /* renamed from: R2 */
    public final void m42106R2(Authentication authentication) {
        authentication.getClass();
        this.authentication_ = authentication;
    }

    /* renamed from: S1 */
    public final void m42103S1() {
        this.billing_ = null;
    }

    /* renamed from: S2 */
    public final void m42102S2(Backend backend) {
        backend.getClass();
        this.backend_ = backend;
    }

    /* renamed from: T1 */
    public final void m42099T1() {
        this.configVersion_ = null;
    }

    /* renamed from: T2 */
    public final void m42098T2(Billing billing) {
        billing.getClass();
        this.billing_ = billing;
    }

    /* renamed from: U1 */
    public final void m42095U1() {
        this.context_ = null;
    }

    /* renamed from: U2 */
    public final void m42094U2(UInt32Value uInt32Value) {
        uInt32Value.getClass();
        this.configVersion_ = uInt32Value;
    }

    /* renamed from: V1 */
    public final void m42091V1() {
        this.control_ = null;
    }

    /* renamed from: V2 */
    public final void m42090V2(Context context) {
        context.getClass();
        this.context_ = context;
    }

    /* renamed from: W1 */
    public final void m42087W1() {
        this.documentation_ = null;
    }

    /* renamed from: W2 */
    public final void m42086W2(Control control) {
        control.getClass();
        this.control_ = control;
    }

    /* renamed from: X1 */
    public final void m42083X1() {
        this.endpoints_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* renamed from: X2 */
    public final void m42082X2(Documentation documentation) {
        documentation.getClass();
        this.documentation_ = documentation;
    }

    /* renamed from: Y1 */
    public final void m42079Y1() {
        this.enums_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* renamed from: Y2 */
    public final void m42078Y2(int i, Endpoint endpoint) {
        endpoint.getClass();
        m42011p2();
        this.endpoints_.set(i, endpoint);
    }

    /* renamed from: Z1 */
    public final void m42075Z1() {
        this.http_ = null;
    }

    /* renamed from: Z2 */
    public final void m42074Z2(int i, Enum r3) {
        r3.getClass();
        m42007q2();
        this.enums_.set(i, r3);
    }

    /* renamed from: a3 */
    public final void m42070a3(Http http) {
        http.getClass();
        this.http_ = http;
    }

    /* renamed from: b2 */
    public final void m42067b2() {
        this.logging_ = null;
    }

    /* renamed from: d3 */
    public final void m42058d3(Logging logging) {
        logging.getClass();
        this.logging_ = logging;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7251a.f51652a[methodToInvoke.ordinal()]) {
            case 1:
                return new Service();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0019\u0000\u0000\u0001%\u0019\u0000\u0007\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004\u001b\u0005\u001b\u0006\t\b\t\t\t\n\t\u000b\t\f\t\u000f\t\u0012\u001b\u0014\t\u0015\t\u0016Ȉ\u0017\u001b\u0018\u001b\u0019\u001b\u001a\t\u001b\t\u001c\t\u001d\t!Ȉ%\t", new Object[]{"name_", "title_", "apis_", Api.class, "types_", Type.class, "enums_", Enum.class, "documentation_", "backend_", "http_", "quota_", "authentication_", "context_", "usage_", "endpoints_", Endpoint.class, "configVersion_", "control_", "producerProjectId_", "logs_", LogDescriptor.class, "metrics_", MetricDescriptor.class, "monitoredResources_", MonitoredResourceDescriptor.class, "billing_", "logging_", "monitoring_", "systemParameters_", "id_", "sourceInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Service> parser = PARSER;
                if (parser == null) {
                    synchronized (Service.class) {
                        try {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
                        } finally {
                        }
                    }
                }
                return parser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* renamed from: e2 */
    public final void m42055e2() {
        this.monitoredResources_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* renamed from: e3 */
    public final void m42054e3(int i, LogDescriptor logDescriptor) {
        logDescriptor.getClass();
        m42003r2();
        this.logs_.set(i, logDescriptor);
    }

    /* renamed from: f2 */
    public final void m42051f2() {
        this.monitoring_ = null;
    }

    /* renamed from: f3 */
    public final void m42050f3(int i, MetricDescriptor metricDescriptor) {
        metricDescriptor.getClass();
        m41999s2();
        this.metrics_.set(i, metricDescriptor);
    }

    /* renamed from: g3 */
    public final void m42046g3(int i, MonitoredResourceDescriptor monitoredResourceDescriptor) {
        monitoredResourceDescriptor.getClass();
        m41995t2();
        this.monitoredResources_.set(i, monitoredResourceDescriptor);
    }

    @Override // com.google.api.ServiceOrBuilder
    public Api getApis(int i) {
        return this.apis_.get(i);
    }

    @Override // com.google.api.ServiceOrBuilder
    public int getApisCount() {
        return this.apis_.size();
    }

    @Override // com.google.api.ServiceOrBuilder
    public List<Api> getApisList() {
        return this.apis_;
    }

    public ApiOrBuilder getApisOrBuilder(int i) {
        return this.apis_.get(i);
    }

    public List<? extends ApiOrBuilder> getApisOrBuilderList() {
        return this.apis_;
    }

    @Override // com.google.api.ServiceOrBuilder
    public Authentication getAuthentication() {
        Authentication authentication = this.authentication_;
        if (authentication == null) {
            return Authentication.getDefaultInstance();
        }
        return authentication;
    }

    @Override // com.google.api.ServiceOrBuilder
    public Backend getBackend() {
        Backend backend = this.backend_;
        if (backend == null) {
            return Backend.getDefaultInstance();
        }
        return backend;
    }

    @Override // com.google.api.ServiceOrBuilder
    public Billing getBilling() {
        Billing billing = this.billing_;
        if (billing == null) {
            return Billing.getDefaultInstance();
        }
        return billing;
    }

    @Override // com.google.api.ServiceOrBuilder
    public UInt32Value getConfigVersion() {
        UInt32Value uInt32Value = this.configVersion_;
        if (uInt32Value == null) {
            return UInt32Value.getDefaultInstance();
        }
        return uInt32Value;
    }

    @Override // com.google.api.ServiceOrBuilder
    public Context getContext() {
        Context context = this.context_;
        if (context == null) {
            return Context.getDefaultInstance();
        }
        return context;
    }

    @Override // com.google.api.ServiceOrBuilder
    public Control getControl() {
        Control control = this.control_;
        if (control == null) {
            return Control.getDefaultInstance();
        }
        return control;
    }

    @Override // com.google.api.ServiceOrBuilder
    public Documentation getDocumentation() {
        Documentation documentation = this.documentation_;
        if (documentation == null) {
            return Documentation.getDefaultInstance();
        }
        return documentation;
    }

    @Override // com.google.api.ServiceOrBuilder
    public Endpoint getEndpoints(int i) {
        return this.endpoints_.get(i);
    }

    @Override // com.google.api.ServiceOrBuilder
    public int getEndpointsCount() {
        return this.endpoints_.size();
    }

    @Override // com.google.api.ServiceOrBuilder
    public List<Endpoint> getEndpointsList() {
        return this.endpoints_;
    }

    public EndpointOrBuilder getEndpointsOrBuilder(int i) {
        return this.endpoints_.get(i);
    }

    public List<? extends EndpointOrBuilder> getEndpointsOrBuilderList() {
        return this.endpoints_;
    }

    @Override // com.google.api.ServiceOrBuilder
    public Enum getEnums(int i) {
        return this.enums_.get(i);
    }

    @Override // com.google.api.ServiceOrBuilder
    public int getEnumsCount() {
        return this.enums_.size();
    }

    @Override // com.google.api.ServiceOrBuilder
    public List<Enum> getEnumsList() {
        return this.enums_;
    }

    public EnumOrBuilder getEnumsOrBuilder(int i) {
        return this.enums_.get(i);
    }

    public List<? extends EnumOrBuilder> getEnumsOrBuilderList() {
        return this.enums_;
    }

    @Override // com.google.api.ServiceOrBuilder
    public Http getHttp() {
        Http http = this.http_;
        if (http == null) {
            return Http.getDefaultInstance();
        }
        return http;
    }

    @Override // com.google.api.ServiceOrBuilder
    public String getId() {
        return this.id_;
    }

    @Override // com.google.api.ServiceOrBuilder
    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }

    @Override // com.google.api.ServiceOrBuilder
    public Logging getLogging() {
        Logging logging = this.logging_;
        if (logging == null) {
            return Logging.getDefaultInstance();
        }
        return logging;
    }

    @Override // com.google.api.ServiceOrBuilder
    public LogDescriptor getLogs(int i) {
        return this.logs_.get(i);
    }

    @Override // com.google.api.ServiceOrBuilder
    public int getLogsCount() {
        return this.logs_.size();
    }

    @Override // com.google.api.ServiceOrBuilder
    public List<LogDescriptor> getLogsList() {
        return this.logs_;
    }

    public LogDescriptorOrBuilder getLogsOrBuilder(int i) {
        return this.logs_.get(i);
    }

    public List<? extends LogDescriptorOrBuilder> getLogsOrBuilderList() {
        return this.logs_;
    }

    @Override // com.google.api.ServiceOrBuilder
    public MetricDescriptor getMetrics(int i) {
        return this.metrics_.get(i);
    }

    @Override // com.google.api.ServiceOrBuilder
    public int getMetricsCount() {
        return this.metrics_.size();
    }

    @Override // com.google.api.ServiceOrBuilder
    public List<MetricDescriptor> getMetricsList() {
        return this.metrics_;
    }

    public MetricDescriptorOrBuilder getMetricsOrBuilder(int i) {
        return this.metrics_.get(i);
    }

    public List<? extends MetricDescriptorOrBuilder> getMetricsOrBuilderList() {
        return this.metrics_;
    }

    @Override // com.google.api.ServiceOrBuilder
    public MonitoredResourceDescriptor getMonitoredResources(int i) {
        return this.monitoredResources_.get(i);
    }

    @Override // com.google.api.ServiceOrBuilder
    public int getMonitoredResourcesCount() {
        return this.monitoredResources_.size();
    }

    @Override // com.google.api.ServiceOrBuilder
    public List<MonitoredResourceDescriptor> getMonitoredResourcesList() {
        return this.monitoredResources_;
    }

    public MonitoredResourceDescriptorOrBuilder getMonitoredResourcesOrBuilder(int i) {
        return this.monitoredResources_.get(i);
    }

    public List<? extends MonitoredResourceDescriptorOrBuilder> getMonitoredResourcesOrBuilderList() {
        return this.monitoredResources_;
    }

    @Override // com.google.api.ServiceOrBuilder
    public Monitoring getMonitoring() {
        Monitoring monitoring = this.monitoring_;
        if (monitoring == null) {
            return Monitoring.getDefaultInstance();
        }
        return monitoring;
    }

    @Override // com.google.api.ServiceOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.google.api.ServiceOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // com.google.api.ServiceOrBuilder
    public String getProducerProjectId() {
        return this.producerProjectId_;
    }

    @Override // com.google.api.ServiceOrBuilder
    public ByteString getProducerProjectIdBytes() {
        return ByteString.copyFromUtf8(this.producerProjectId_);
    }

    @Override // com.google.api.ServiceOrBuilder
    public Quota getQuota() {
        Quota quota = this.quota_;
        if (quota == null) {
            return Quota.getDefaultInstance();
        }
        return quota;
    }

    @Override // com.google.api.ServiceOrBuilder
    public SourceInfo getSourceInfo() {
        SourceInfo sourceInfo = this.sourceInfo_;
        if (sourceInfo == null) {
            return SourceInfo.getDefaultInstance();
        }
        return sourceInfo;
    }

    @Override // com.google.api.ServiceOrBuilder
    public SystemParameters getSystemParameters() {
        SystemParameters systemParameters = this.systemParameters_;
        if (systemParameters == null) {
            return SystemParameters.getDefaultInstance();
        }
        return systemParameters;
    }

    @Override // com.google.api.ServiceOrBuilder
    public String getTitle() {
        return this.title_;
    }

    @Override // com.google.api.ServiceOrBuilder
    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    @Override // com.google.api.ServiceOrBuilder
    public Type getTypes(int i) {
        return this.types_.get(i);
    }

    @Override // com.google.api.ServiceOrBuilder
    public int getTypesCount() {
        return this.types_.size();
    }

    @Override // com.google.api.ServiceOrBuilder
    public List<Type> getTypesList() {
        return this.types_;
    }

    public TypeOrBuilder getTypesOrBuilder(int i) {
        return this.types_.get(i);
    }

    public List<? extends TypeOrBuilder> getTypesOrBuilderList() {
        return this.types_;
    }

    @Override // com.google.api.ServiceOrBuilder
    public Usage getUsage() {
        Usage usage = this.usage_;
        if (usage == null) {
            return Usage.getDefaultInstance();
        }
        return usage;
    }

    /* renamed from: h2 */
    public final void m42043h2() {
        this.producerProjectId_ = getDefaultInstance().getProducerProjectId();
    }

    /* renamed from: h3 */
    public final void m42042h3(Monitoring monitoring) {
        monitoring.getClass();
        this.monitoring_ = monitoring;
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasAuthentication() {
        if (this.authentication_ != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasBackend() {
        if (this.backend_ != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasBilling() {
        if (this.billing_ != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasConfigVersion() {
        if (this.configVersion_ != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasContext() {
        if (this.context_ != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasControl() {
        if (this.control_ != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasDocumentation() {
        if (this.documentation_ != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasHttp() {
        if (this.http_ != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasLogging() {
        if (this.logging_ != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasMonitoring() {
        if (this.monitoring_ != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasQuota() {
        if (this.quota_ != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasSourceInfo() {
        if (this.sourceInfo_ != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasSystemParameters() {
        if (this.systemParameters_ != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasUsage() {
        if (this.usage_ != null) {
            return true;
        }
        return false;
    }

    /* renamed from: i2 */
    public final void m42039i2() {
        this.quota_ = null;
    }

    /* renamed from: j2 */
    public final void m42035j2() {
        this.sourceInfo_ = null;
    }

    /* renamed from: k2 */
    public final void m42031k2() {
        this.systemParameters_ = null;
    }

    /* renamed from: k3 */
    public final void m42030k3(String str) {
        str.getClass();
        this.producerProjectId_ = str;
    }

    /* renamed from: l2 */
    public final void m42027l2() {
        this.title_ = getDefaultInstance().getTitle();
    }

    /* renamed from: l3 */
    public final void m42026l3(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.producerProjectId_ = byteString.toStringUtf8();
    }

    /* renamed from: m2 */
    public final void m42023m2() {
        this.types_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* renamed from: m3 */
    public final void m42022m3(Quota quota) {
        quota.getClass();
        this.quota_ = quota;
    }

    /* renamed from: n2 */
    public final void m42019n2() {
        this.usage_ = null;
    }

    /* renamed from: n3 */
    public final void m42018n3(SourceInfo sourceInfo) {
        sourceInfo.getClass();
        this.sourceInfo_ = sourceInfo;
    }

    /* renamed from: o2 */
    public final void m42015o2() {
        Internal.ProtobufList<Api> protobufList = this.apis_;
        if (!protobufList.isModifiable()) {
            this.apis_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    /* renamed from: o3 */
    public final void m42014o3(SystemParameters systemParameters) {
        systemParameters.getClass();
        this.systemParameters_ = systemParameters;
    }

    /* renamed from: p2 */
    public final void m42011p2() {
        Internal.ProtobufList<Endpoint> protobufList = this.endpoints_;
        if (!protobufList.isModifiable()) {
            this.endpoints_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    /* renamed from: p3 */
    public final void m42010p3(String str) {
        str.getClass();
        this.title_ = str;
    }

    /* renamed from: q2 */
    public final void m42007q2() {
        Internal.ProtobufList<Enum> protobufList = this.enums_;
        if (!protobufList.isModifiable()) {
            this.enums_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    /* renamed from: q3 */
    public final void m42006q3(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.title_ = byteString.toStringUtf8();
    }

    /* renamed from: r3 */
    public final void m42002r3(int i, Type type) {
        type.getClass();
        m41992u2();
        this.types_.set(i, type);
    }

    /* renamed from: s3 */
    public final void m41998s3(Usage usage) {
        usage.getClass();
        this.usage_ = usage;
    }

    /* renamed from: t2 */
    public final void m41995t2() {
        Internal.ProtobufList<MonitoredResourceDescriptor> protobufList = this.monitoredResources_;
        if (!protobufList.isModifiable()) {
            this.monitoredResources_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    /* renamed from: u1 */
    public final void m41993u1(Iterable iterable) {
        m42015o2();
        AbstractMessageLite.addAll(iterable, (List) this.apis_);
    }

    /* renamed from: u2 */
    public final void m41992u2() {
        Internal.ProtobufList<Type> protobufList = this.types_;
        if (!protobufList.isModifiable()) {
            this.types_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    /* renamed from: v1 */
    public final void m41990v1(Iterable iterable) {
        m42011p2();
        AbstractMessageLite.addAll(iterable, (List) this.endpoints_);
    }

    /* renamed from: v2 */
    public final void m41989v2(Authentication authentication) {
        authentication.getClass();
        Authentication authentication2 = this.authentication_;
        if (authentication2 != null && authentication2 != Authentication.getDefaultInstance()) {
            this.authentication_ = Authentication.newBuilder(this.authentication_).mergeFrom((Authentication.Builder) authentication).buildPartial();
        } else {
            this.authentication_ = authentication;
        }
    }

    /* renamed from: w1 */
    public final void m41987w1(Iterable iterable) {
        m42007q2();
        AbstractMessageLite.addAll(iterable, (List) this.enums_);
    }

    /* renamed from: w2 */
    public final void m41986w2(Backend backend) {
        backend.getClass();
        Backend backend2 = this.backend_;
        if (backend2 != null && backend2 != Backend.getDefaultInstance()) {
            this.backend_ = Backend.newBuilder(this.backend_).mergeFrom((Backend.Builder) backend).buildPartial();
        } else {
            this.backend_ = backend;
        }
    }

    /* renamed from: x2 */
    public final void m41983x2(Billing billing) {
        billing.getClass();
        Billing billing2 = this.billing_;
        if (billing2 != null && billing2 != Billing.getDefaultInstance()) {
            this.billing_ = Billing.newBuilder(this.billing_).mergeFrom((Billing.Builder) billing).buildPartial();
        } else {
            this.billing_ = billing;
        }
    }

    /* renamed from: y2 */
    public final void m41980y2(UInt32Value uInt32Value) {
        uInt32Value.getClass();
        UInt32Value uInt32Value2 = this.configVersion_;
        if (uInt32Value2 != null && uInt32Value2 != UInt32Value.getDefaultInstance()) {
            this.configVersion_ = UInt32Value.newBuilder(this.configVersion_).mergeFrom((UInt32Value.Builder) uInt32Value).buildPartial();
        } else {
            this.configVersion_ = uInt32Value;
        }
    }

    /* renamed from: z1 */
    public final void m41978z1(Iterable iterable) {
        m41995t2();
        AbstractMessageLite.addAll(iterable, (List) this.monitoredResources_);
    }

    /* renamed from: z2 */
    public final void m41977z2(Context context) {
        context.getClass();
        Context context2 = this.context_;
        if (context2 != null && context2 != Context.getDefaultInstance()) {
            this.context_ = Context.newBuilder(this.context_).mergeFrom((Context.Builder) context).buildPartial();
        } else {
            this.context_ = context;
        }
    }

    public static Builder newBuilder(Service service) {
        return DEFAULT_INSTANCE.createBuilder(service);
    }

    public static Service parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Service) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Service parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Service parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Service parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Service parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Service parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Service parseFrom(InputStream inputStream) throws IOException {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Service parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Service parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Service parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
