package com.google.android.gms.measurement.internal;

import android.content.Context;
import androidx.compose.p003ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.lifecycle.CoroutineLiveDataKt;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.spi.ComponentTracker;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzhp;
import com.zxy.tiny.common.UriUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@VisibleForTesting
/* loaded from: classes3.dex */
public final class zzeb {
    public static final zzea zzA;
    public static final zzea zzB;
    public static final zzea zzC;
    public static final zzea zzD;
    public static final zzea zzE;
    public static final zzea zzF;
    public static final zzea zzG;
    public static final zzea zzH;
    public static final zzea zzI;
    public static final zzea zzJ;
    public static final zzea zzK;
    public static final zzea zzL;
    public static final zzea zzM;
    public static final zzea zzN;
    public static final zzea zzO;
    public static final zzea zzP;
    public static final zzea zzQ;
    public static final zzea zzR;
    public static final zzea zzS;
    public static final zzea zzT;
    public static final zzea zzU;
    public static final zzea zzV;
    public static final zzea zzW;
    public static final zzea zzX;
    public static final zzea zzY;
    public static final zzea zzZ;
    public static final zzea zzaA;
    public static final zzea zzaB;
    public static final zzea zzaa;
    public static final zzea zzab;
    public static final zzea zzac;
    public static final zzea zzad;
    public static final zzea zzae;
    public static final zzea zzaf;
    public static final zzea zzag;
    public static final zzea zzah;
    public static final zzea zzai;
    public static final zzea zzaj;
    public static final zzea zzak;
    public static final zzea zzal;
    public static final zzea zzam;
    public static final zzea zzan;
    public static final zzea zzao;
    public static final zzea zzap;
    public static final zzea zzaq;
    public static final zzea zzar;
    public static final zzea zzas;
    public static final zzea zzat;
    public static final zzea zzau;
    public static final zzea zzav;
    public static final zzea zzaw;
    public static final zzea zzax;
    public static final zzea zzay;
    public static final zzea zzaz;
    public static final zzea zzc;
    public static final zzea zzd;
    public static final zzea zze;
    public static final zzea zzf;
    public static final zzea zzg;
    public static final zzea zzh;
    public static final zzea zzi;
    public static final zzea zzj;
    public static final zzea zzk;
    public static final zzea zzl;
    public static final zzea zzm;
    public static final zzea zzn;
    public static final zzea zzo;
    public static final zzea zzp;
    public static final zzea zzq;
    public static final zzea zzr;
    public static final zzea zzs;
    public static final zzea zzt;
    public static final zzea zzu;
    public static final zzea zzv;
    public static final zzea zzw;
    public static final zzea zzx;
    public static final zzea zzy;
    public static final zzea zzz;

    /* renamed from: a */
    public static final List f48279a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b */
    public static final Set f48280b = Collections.synchronizedSet(new HashSet());
    public static final zzea zza = m46333a("measurement.ad_id_cache_time", 10000L, 10000L, zzbj.zza);
    public static final zzea zzb = m46333a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, zzbb.zza);

    static {
        Long valueOf = Long.valueOf((long) CoreConstants.MILLIS_IN_ONE_HOUR);
        zzc = m46333a("measurement.config.cache_time", 86400000L, valueOf, zzbn.zza);
        zzd = m46333a("measurement.config.url_scheme", UriUtil.HTTPS_SCHEME, UriUtil.HTTPS_SCHEME, zzbz.zza);
        zze = m46333a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", zzcl.zza);
        zzf = m46333a("measurement.upload.max_bundles", 100, 100, zzcx.zza);
        zzg = m46333a("measurement.upload.max_batch_size", 65536, 65536, zzdj.zza);
        zzh = m46333a("measurement.upload.max_bundle_size", 65536, 65536, zzdr.zza);
        zzi = m46333a("measurement.upload.max_events_per_bundle", 1000, 1000, zzds.zza);
        Integer valueOf2 = Integer.valueOf((int) AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength);
        zzj = m46333a("measurement.upload.max_events_per_day", valueOf2, valueOf2, zzdt.zza);
        zzk = m46333a("measurement.upload.max_error_events_per_day", 1000, 1000, zzbu.zza);
        zzl = m46333a("measurement.upload.max_public_events_per_day", 50000, 50000, zzcf.zza);
        zzm = m46333a("measurement.upload.max_conversions_per_day", 10000, 10000, zzcq.zza);
        zzn = m46333a("measurement.upload.max_realtime_events_per_day", 10, 10, zzdb.zza);
        zzo = m46333a("measurement.store.max_stored_events_per_app", valueOf2, valueOf2, zzdm.zza);
        zzp = m46333a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", zzdu.zza);
        zzq = m46333a("measurement.upload.backoff_period", 43200000L, 43200000L, zzdv.zza);
        zzr = m46333a("measurement.upload.window_interval", valueOf, valueOf, zzdw.zza);
        zzs = m46333a("measurement.upload.interval", valueOf, valueOf, zzaz.zza);
        zzt = m46333a("measurement.upload.realtime_upload_interval", 10000L, 10000L, zzba.zza);
        zzu = m46333a("measurement.upload.debug_upload_interval", 1000L, 1000L, zzbc.zza);
        zzv = m46333a("measurement.upload.minimum_delay", 500L, 500L, zzbd.zza);
        zzw = m46333a("measurement.alarm_manager.minimum_interval", 60000L, 60000L, zzbe.zza);
        zzx = m46333a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, zzbf.zza);
        Long valueOf3 = Long.valueOf((long) CoreConstants.MILLIS_IN_ONE_WEEK);
        zzy = m46333a("measurement.upload.refresh_blacklisted_config_interval", valueOf3, valueOf3, zzbg.zza);
        zzz = m46333a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, zzbh.zza);
        Long valueOf4 = Long.valueOf((long) ComponentTracker.DEFAULT_TIMEOUT);
        zzA = m46333a("measurement.upload.retry_time", valueOf4, valueOf4, zzbi.zza);
        zzB = m46333a("measurement.upload.retry_count", 6, 6, zzbk.zza);
        zzC = m46333a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, zzbl.zza);
        zzD = m46333a("measurement.lifetimevalue.max_currency_tracked", 4, 4, zzbm.zza);
        zzE = m46333a("measurement.audience.filter_result_max_count", 200, 200, zzbo.zza);
        zzF = m46333a("measurement.upload.max_public_user_properties", 25, 25, null);
        zzG = m46333a("measurement.upload.max_event_name_cardinality", 500, 500, null);
        zzH = m46333a("measurement.upload.max_public_event_params", 25, 25, null);
        Long valueOf5 = Long.valueOf((long) CoroutineLiveDataKt.DEFAULT_TIMEOUT);
        zzI = m46333a("measurement.service_client.idle_disconnect_millis", valueOf5, valueOf5, zzbp.zza);
        Boolean bool = Boolean.FALSE;
        zzJ = m46333a("measurement.test.boolean_flag", bool, bool, zzbq.zza);
        zzK = m46333a("measurement.test.string_flag", "---", "---", zzbr.zza);
        zzL = m46333a("measurement.test.long_flag", -1L, -1L, zzbs.zza);
        zzM = m46333a("measurement.test.int_flag", -2, -2, zzbt.zza);
        Double valueOf6 = Double.valueOf(-3.0d);
        zzN = m46333a("measurement.test.double_flag", valueOf6, valueOf6, zzbv.zza);
        zzO = m46333a("measurement.experiment.max_ids", 50, 50, zzbw.zza);
        zzP = m46333a("measurement.max_bundles_per_iteration", 100, 100, zzbx.zza);
        zzQ = m46333a("measurement.sdk.attribution.cache.ttl", valueOf3, valueOf3, zzby.zza);
        zzR = m46333a("measurement.redaction.app_instance_id.ttl", 7200000L, 7200000L, zzca.zza);
        Boolean bool2 = Boolean.TRUE;
        zzS = m46333a("measurement.collection.log_event_and_bundle_v2", bool2, bool2, zzcb.zza);
        zzT = m46333a("measurement.quality.checksum", bool, bool, null);
        zzU = m46333a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, zzcc.zza);
        zzV = m46333a("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, zzcd.zza);
        zzW = m46333a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, zzce.zza);
        zzX = m46333a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, zzcg.zza);
        zzY = m46333a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, zzch.zza);
        zzZ = m46333a("measurement.lifecycle.app_in_background_parameter", bool, bool, zzci.zza);
        zzaa = m46333a("measurement.integration.disable_firebase_instance_id", bool, bool, zzcj.zza);
        zzab = m46333a("measurement.collection.service.update_with_analytics_fix", bool, bool, zzck.zza);
        zzac = m46333a("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, zzcm.zza);
        zzad = m46333a("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, zzcn.zza);
        zzae = m46333a("measurement.collection.synthetic_data_mitigation", bool, bool, zzco.zza);
        zzaf = m46333a("measurement.service.storage_consent_support_version", 203600, 203600, zzcp.zza);
        zzag = m46333a("measurement.client.click_identifier_control.dev", bool, bool, zzcr.zza);
        zzah = m46333a("measurement.service.click_identifier_control", bool, bool, zzcs.zza);
        zzai = m46333a("measurement.service.store_null_safelist", bool2, bool2, zzct.zza);
        zzaj = m46333a("measurement.service.store_safelist", bool2, bool2, zzcu.zza);
        zzak = m46333a("measurement.redaction.no_aiid_in_config_request", bool2, bool2, zzcv.zza);
        zzal = m46333a("measurement.redaction.config_redacted_fields", bool2, bool2, zzcw.zza);
        zzam = m46333a("measurement.redaction.upload_redacted_fields", bool2, bool2, zzcy.zza);
        zzan = m46333a("measurement.redaction.upload_subdomain_override", bool2, bool2, zzcz.zza);
        zzao = m46333a("measurement.redaction.device_info", bool2, bool2, zzda.zza);
        zzap = m46333a("measurement.redaction.user_id", bool2, bool2, zzdc.zza);
        zzaq = m46333a("measurement.redaction.google_signals", bool2, bool2, zzdd.zza);
        zzar = m46333a("measurement.collection.enable_session_stitching_token.service", bool, bool, zzde.zza);
        zzas = m46333a("measurement.collection.enable_session_stitching_token.client.dev", bool, bool, zzdf.zza);
        zzat = m46333a("measurement.redaction.app_instance_id", bool2, bool2, zzdg.zza);
        zzau = m46333a("measurement.redaction.populate_ephemeral_app_instance_id", bool2, bool2, zzdh.zza);
        zzav = m46333a("measurement.redaction.enhanced_uid", bool2, bool2, zzdi.zza);
        zzaw = m46333a("measurement.redaction.e_tag", bool2, bool2, zzdk.zza);
        zzax = m46333a("measurement.redaction.client_ephemeral_aiid_generation", bool2, bool2, zzdl.zza);
        zzay = m46333a("measurement.redaction.retain_major_os_version", bool2, bool2, zzdn.zza);
        zzaz = m46333a("measurement.redaction.scion_payload_generator", bool2, bool2, zzdo.zza);
        zzaA = m46333a("measurement.audience.dynamic_filters.oob_fix", bool2, bool2, zzdp.zza);
        zzaB = m46333a("measurement.service.clear_global_params_on_uninstall", bool2, bool2, zzdq.zza);
    }

    /* renamed from: a */
    public static zzea m46333a(String str, Object obj, Object obj2, InterfaceC18378Rj2 interfaceC18378Rj2) {
        zzea zzeaVar = new zzea(str, obj, obj2, interfaceC18378Rj2, null);
        f48279a.add(zzeaVar);
        return zzeaVar;
    }

    public static Map zzc(Context context) {
        com.google.android.gms.internal.measurement.zzhe zza2 = com.google.android.gms.internal.measurement.zzhe.zza(context.getContentResolver(), zzhp.zza("com.google.android.gms.measurement"), zzay.zza);
        if (zza2 == null) {
            return Collections.emptyMap();
        }
        return zza2.zzc();
    }
}
