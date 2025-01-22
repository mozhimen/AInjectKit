# Keep for the reflective cast done in EntryPoints.
# See b/183070411#comment4 for more info.
-keep,allowobfuscation,allowshrinking @dagger.hilt.EntryPoint class *

# Keep for the reflective cast done in EntryPoints.
# See b/183070411#comment4 for more info.
-keep,allowobfuscation,allowshrinking @dagger.hilt.android.EarlyEntryPoint class *

# Keep for the reflective cast done in EntryPoints.
# See b/183070411#comment4 for more info.
-keep,allowobfuscation,allowshrinking @dagger.hilt.internal.ComponentEntryPoint class *
-keep,allowobfuscation,allowshrinking @dagger.hilt.internal.GeneratedEntryPoint class *

-dontwarn com.google.errorprone.annotations.MustBeClosed
# These are rules to enable instrumentation test to run while main app is optimized
# TODO(b/324097623) Remove the keep rules once test won't be affected by obfuscation
-keep class kotlin.**
-keep class com.google.common.util.concurrent.ListenableFuture {
    <methods>;
}
