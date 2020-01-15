package com.hapi.denpend

public class DependsComp {
    int compileSdkVersion = 28
    String buildToolsVersion = '28.0.3'

    int minSdkVersion = 17
    int targetSdkVersion = 28
    String androidxVersion = "1.1.0"
    String designVersion = "1.0.0"
    String supportVersion = '28.0.0'

    boolean latest = true
    boolean thirdPartLatest = false


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

    def appcompat() {
        return appcompat(androidxVersion)
    }

    def appcompat(String version) {
        return "androidx.appcompat:appcompat:${version}"
    }

    def support_compat() {
        return support_compat("1.2.0-rc01")
    }

    def support_compat(String version) {
        return "androidx.core:core:${version}"
    }


    def cardview() {
        return cardview(designVersion)
    }

    def cardview(String version) {
        return "androidx.cardview:cardview:${version}"
    }

    def recyclerview() {
        return recyclerview("1.1.0-rc01")
    }

    def recyclerview(String version) {
        return "androidx.recyclerview:recyclerview:${version}"
    }

    def design() {
        return design("1.1.0-beta02")
    }

    def design(String version) {
        return "com.google.android.material:material:${version}"
    }

    def percent() {
        return percent(designVersion)
    }

    def percent(String version) {
        return "androidx.percentlayout:percentlayout:${version}"
    }

    def constraintLayout() {
        return constraintLayout("1.1.3")
    }

    def constraintLayout(String version) {
        return "androidx.constraintlayout:constraintlayout:${version}"
    }

    def multidex() {
        return multidex("2.0.1")
    }

    def multidex(String version) {
        return "androidx.multidex:multidex:${version}"
    }

    def fragment() {
        fragment("1.2.0-rc03")
    }

    def fragment(String version) {
        return "androidx.fragment:fragment:${version}"
    }

    def viewpager() {
        viewpager(designVersion)
    }

    def viewpager(String version) {
        return "androidx.viewpager:viewpager:${version}"
    }

    def coordinatorlayout() {
        coordinatorlayout(androidxVersion)
    }

    def coordinatorlayout(String version) {
        return "androidx.coordinatorlayout:coordinatorlayout:${version}"
    }

    def drawerlayout() {
        drawerlayout(designVersion)
    }

    def drawerlayout(String version) {
        return "androidx.drawerlayout:drawerlayout:${version}"
    }

    def gridlayout() {
        gridlayout(androidxVersion)
    }

    def gridlayout(String version) {
        return "androidx.gridlayout:gridlayout:${version}"
    }

    def annotations() {
        annotations(androidxVersion)
    }

    def annotations(String version) {
        return "androidx.annotation:annotation:${version}"
    }

    def lifecycle() {
        return lifecycle("2.1.0")
    }

    def lifecycle(String version) {
        return "androidx.lifecycle:lifecycle-extensions:${version}"
    }

    def swiperefreshlayout() {
        swiperefreshlayout(designVersion)
    }

    def swiperefreshlayout(String version) {
        return "androidx.swiperefreshlayout:swiperefreshlayout:${version}"
    }

    def kotlin() {
        return kotlin("1.3.61")
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
        return kapt_databinding("3.5.3")
    }

    def kapt_databinding(String version) {
        return "androidx.databinding:databinding-compiler:${version}"
    }

    def databinding() {
        return databinding("3.5.3")
    }

    def databinding(String version) {
        return "androidx.databinding :databinding-common:${version}"
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