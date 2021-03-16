package com.hapi.denpend

public class DependsComp {
    int compileSdkVersion = 30
    String buildToolsVersion = "30.0.3"

    int minSdkVersion = 21
    int targetSdkVersion = 30
    String androidxVersion = "1.2.0"
    String designVersion = "1.0.0"
    //  String supportVersion = '28.0.0'

    def lifecycle_version = "2.3.0"
    def arch_version = "2.1.0"

    boolean latest = true
    boolean thirdPartLatest = false



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


    def corektx() {
        return corektx('1.3.2')
    }

    def corektx(String version) {
        return "androidx.core:core-ktx:${version}"
    }




    def cardview() {
        return cardview(designVersion)
    }

    def cardview(String version) {
        return "androidx.cardview:cardview:${version}"
    }

    def recyclerview() {
        return recyclerview("1.1.0")
    }

    def recyclerview(String version) {
        return "androidx.recyclerview:recyclerview:${version}"
    }

    def design() {
        return design("1.3.0")
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
        return constraintLayout("2.0.4")
    }

    def constraintLayout(String version) {
        return "androidx.constraintlayout:constraintlayout:${version}"
    }



    def fragment() {
        fragment("1.2.5")
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


    def coroutines() {
        return coroutines('1.3.9')
    }

    def coroutines(String version) {
        return "org.jetbrains.kotlinx:kotlinx-coroutines-android:${version}"
    }


    //jitpack

    def lifecycle() {
        return lifecycle("2.1.0")
    }
    def lifecycle(String version) {
        return "androidx.lifecycle:lifecycle-extensions:${version}"
    }


    def viewModel(){
        return "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version"
    }
    def liveData(){
        return "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version"
    }
    def runtime_ktx(){
        return "androidx.lifecycle:lifecycle-runtime-ktx:$lifecycle_version"
    }
    def viewmodelSavedstate(){
        return "androidx.lifecycle:lifecycle-viewmodel-savedstate:$lifecycle_version"
    }
    def viewmodelCompose(){
        return "androidx.lifecycle:lifecycle-viewmodel-compose:1.0.0-alpha01"
    }
    def lifecycleCompiler(){
        return "androidx.lifecycle:lifecycle-compiler:$lifecycle_version"
    }

    def activityKtx(){
        return "androidx.activity:activity-ktx:1.1.0"
    }
    def fragmentKtx(){
        return "androidx.fragment:fragment-ktx:1.2.5"
    }


    def swiperefreshlayout() {
        swiperefreshlayout(designVersion)
    }

    def swiperefreshlayout(String version) {
        return "androidx.swiperefreshlayout:swiperefreshlayout:${version}"
    }

    def kotlin() {
        return kotlin("1.4.0")
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