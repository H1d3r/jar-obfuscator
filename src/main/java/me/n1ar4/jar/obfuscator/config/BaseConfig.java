/*
 * MIT License
 *
 * Project URL: https://github.com/jar-analyzer/jar-obfuscator
 *
 * Copyright (c) 2024-2025 4ra1n (https://github.com/4ra1n)
 *
 * This project is distributed under the MIT license.
 *
 * https://opensource.org/license/mit
 */

package me.n1ar4.jar.obfuscator.config;

import java.util.List;

public class BaseConfig {
    private String logLevel;
    private boolean asmAutoCompute;
    private boolean useSpringBoot;
    private boolean useWebWar;
    private List<String> obfuscateChars;
    private List<String> classBlackList;
    private List<String> classBlackRegexList;
    private List<String> methodBlackList;
    private boolean enableClassName;
    private boolean enablePackageName;
    private boolean enableMethodName;
    private boolean enableFieldName;
    private boolean enableParamName;
    private boolean enableXOR;
    private boolean enableEncryptString;
    private String stringAesKey;
    private boolean enableAdvanceString;
    private String advanceStringName;
    private String decryptClassName;
    private String decryptMethodName;
    private String decryptKeyName;
    private boolean enableHideMethod;
    private boolean enableHideField;
    private boolean enableDeleteCompileInfo;
    private boolean enableJunk;
    private int junkLevel;
    private int maxJunkOneClass;
    private boolean showAllMainMethods;
    private boolean keepTempFile;

    public boolean isUseSpringBoot() {
        return useSpringBoot;
    }

    public void setUseSpringBoot(boolean useSpringBoot) {
        this.useSpringBoot = useSpringBoot;
    }

    public boolean isUseWebWar() {
        return useWebWar;
    }

    public void setUseWebWar(boolean useWebWar) {
        this.useWebWar = useWebWar;
    }

    public String getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    public List<String> getObfuscateChars() {
        return obfuscateChars;
    }

    public void setObfuscateChars(List<String> obfuscateChars) {
        this.obfuscateChars = obfuscateChars;
    }

    public List<String> getClassBlackList() {
        return classBlackList;
    }

    public void setClassBlackList(List<String> classBlackList) {
        this.classBlackList = classBlackList;
    }

    public List<String> getClassBlackRegexList() {
        return classBlackRegexList;
    }

    public void setClassBlackRegexList(List<String> classBlackRegexList) {
        this.classBlackRegexList = classBlackRegexList;
    }

    public List<String> getMethodBlackList() {
        return methodBlackList;
    }

    public void setMethodBlackList(List<String> methodBlackList) {
        this.methodBlackList = methodBlackList;
    }

    public boolean isEnableClassName() {
        return enableClassName;
    }

    public void setEnableClassName(boolean enableClassName) {
        this.enableClassName = enableClassName;
    }

    public boolean isEnablePackageName() {
        return enablePackageName;
    }

    public void setEnablePackageName(boolean enablePackageName) {
        this.enablePackageName = enablePackageName;
    }

    public boolean isEnableMethodName() {
        return enableMethodName;
    }

    public void setEnableMethodName(boolean enableMethodName) {
        this.enableMethodName = enableMethodName;
    }

    public boolean isEnableFieldName() {
        return enableFieldName;
    }

    public void setEnableFieldName(boolean enableFieldName) {
        this.enableFieldName = enableFieldName;
    }

    public boolean isEnableParamName() {
        return enableParamName;
    }

    public void setEnableParamName(boolean enableParamName) {
        this.enableParamName = enableParamName;
    }

    public boolean isEnableXOR() {
        return enableXOR;
    }

    public void setEnableXOR(boolean enableXOR) {
        this.enableXOR = enableXOR;
    }

    public boolean isEnableEncryptString() {
        return enableEncryptString;
    }

    public void setEnableEncryptString(boolean enableEncryptString) {
        this.enableEncryptString = enableEncryptString;
    }

    public String getStringAesKey() {
        return stringAesKey;
    }

    public void setStringAesKey(String stringAesKey) {
        this.stringAesKey = stringAesKey;
    }

    public boolean isEnableAdvanceString() {
        return enableAdvanceString;
    }

    public void setEnableAdvanceString(boolean enableAdvanceString) {
        this.enableAdvanceString = enableAdvanceString;
    }

    public String getAdvanceStringName() {
        return advanceStringName;
    }

    public void setAdvanceStringName(String advanceStringName) {
        this.advanceStringName = advanceStringName;
    }

    public String getDecryptClassName() {
        return decryptClassName;
    }

    public void setDecryptClassName(String decryptClassName) {
        this.decryptClassName = decryptClassName;
    }

    public String getDecryptMethodName() {
        return decryptMethodName;
    }

    public void setDecryptMethodName(String decryptMethodName) {
        this.decryptMethodName = decryptMethodName;
    }

    public String getDecryptKeyName() {
        return decryptKeyName;
    }

    public void setDecryptKeyName(String decryptKeyName) {
        this.decryptKeyName = decryptKeyName;
    }

    public boolean isEnableHideMethod() {
        return enableHideMethod;
    }

    public void setEnableHideMethod(boolean enableHideMethod) {
        this.enableHideMethod = enableHideMethod;
    }

    public boolean isEnableHideField() {
        return enableHideField;
    }

    public void setEnableHideField(boolean enableHideField) {
        this.enableHideField = enableHideField;
    }

    public boolean isEnableDeleteCompileInfo() {
        return enableDeleteCompileInfo;
    }

    public void setEnableDeleteCompileInfo(boolean enableDeleteCompileInfo) {
        this.enableDeleteCompileInfo = enableDeleteCompileInfo;
    }

    public boolean isEnableJunk() {
        return enableJunk;
    }

    public void setEnableJunk(boolean enableJunk) {
        this.enableJunk = enableJunk;
    }

    public int getJunkLevel() {
        return junkLevel;
    }

    public void setJunkLevel(int junkLevel) {
        this.junkLevel = junkLevel;
    }

    public int getMaxJunkOneClass() {
        return maxJunkOneClass;
    }

    public void setMaxJunkOneClass(int maxJunkOneClass) {
        this.maxJunkOneClass = maxJunkOneClass;
    }

    public boolean isShowAllMainMethods() {
        return showAllMainMethods;
    }

    public void setShowAllMainMethods(boolean showAllMainMethods) {
        this.showAllMainMethods = showAllMainMethods;
    }

    public boolean isKeepTempFile() {
        return keepTempFile;
    }

    public void setKeepTempFile(boolean keepTempFile) {
        this.keepTempFile = keepTempFile;
    }

    public boolean isAsmAutoCompute() {
        return asmAutoCompute;
    }

    public void setAsmAutoCompute(boolean asmAutoCompute) {
        this.asmAutoCompute = asmAutoCompute;
    }
}
