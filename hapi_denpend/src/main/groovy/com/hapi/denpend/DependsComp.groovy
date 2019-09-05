package com.hapi.denpend

public class DependsComp {
    int compileSdkVersion = 27
    String buildToolsVersion = '27.0.3'

    int minSdkVersion = 17
    int targetSdkVersion = 27
    String supportVersion = '27.1.1'

    boolean latest = true
    boolean thirdPartLatest = false

    // =====================================================================
    // ========================== 系统库 ====================================
    // =====================================================================
    def support_v4() {
        return support_v4(supportVersion)
    }

    def support_v4(String version) {
        return "com.android.support:support-v4:${version}"
    }

    def appcompat_v7() {
        return appcompat_v7(supportVersion)
    }

    def appcompat_v7(String version) {
        return "com.android.support:appcompat-v7:${version}"
    }

    def cardview_v7() {
        return cardview_v7(supportVersion)
    }

    def cardview_v7(String version) {
        return "com.android.support:cardview-v7:${version}"
    }

    def rv_v7() {
        return rv_v7(supportVersion)
    }

    def rv_v7(String version) {
        return "com.android.support:recyclerview-v7:${version}"
    }

    def design() {
        return design(supportVersion)
    }

    def design(String version) {
        return "com.android.support:design:${version}"
    }

    def percent() {
        return percent(supportVersion)
    }

    def percent(String version) {
        return "com.android.support:percent:${version}"
    }

    def constraintLayout() {
        String version = latest ? 'latest.release' : '1.0.2'
        return constraintLayout(version)
    }

    def constraintLayout(String version) {
        return "com.android.support.constraint:constraint-layout:${version}"
    }

    def multidex() {
        String version = latest ? 'latest.release' : '1.0.2'
        return multidex(version)
    }

    def multidex(String version) {
        return "com.android.support:multidex:${version}"
    }

    def lifecycle() {
        String version = latest ? 'latest.release' : '1.1.1'
        return lifecycle(version)
    }

    def lifecycle(String version) {
        return "android.arch.lifecycle:extensions:${version}"
    }

    def kotlin() {
        String version = latest ? 'latest.release' : '1.2.50'
        return kotlin(version)
    }

    def kotlin(String version) {
        return "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${version}"
    }

    def kotlin_anko() {
        String version = latest ? 'latest.release' : '0.10.5'
        return kotlin_anko(version)
    }

    def kotlin_anko(String version) {
        return "org.jetbrains.anko:anko-commons:${version}"
    }

    /**
     * kotlin和databinding兼容库
     * @return
     */
    def kapt_databinding() {
        String version = latest ? 'latest.release' : '3.1.0'
        return kotlin_anko(version)
    }

    def kapt_databinding(String version) {
        return "'com.android.databinding:compiler:${version}"
    }

    // =====================================================================
    // ========================== 底层lib库 =================================
    // =====================================================================





    // =====================================================================
    // ==========================  基础组件库 ===============================
    // =====================================================================



    // =====================================================================
    // ==========================  base基础库 ===============================
    // =====================================================================





    // =====================================================================
    // ==========================  业务组件库 ===============================
    // =====================================================================

}