<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:output method="text" indent="no"/>

<xsl:template match="/">@echo off

Rem CJDBC_HOME definition
SET CJDBC_HOME="$INSTALL_PATH"

:begin

:java
Rem JAVA setup.
Rem
Rem We try to use first the java JVM in JAVA_HOME and if not found, 
Rem we use the one found in the path.
Rem You can specify additional options to give to the Java JVM in the
Rem JAVA_OPTS environment variable.
SET JAVA=java
if not exist %JAVA_HOME%\bin\java goto definition
SET JAVA=%JAVA_HOME%\bin\java

:definition
<xsl:apply-templates select="script/definition"/>
<xsl:apply-templates select="script/classpath"/>

<xsl:apply-templates select="script/java"/>
:end
</xsl:template>

<xsl:template match="definition">
SET<xsl:text> </xsl:text><xsl:value-of select="@name"/>=<xsl:if test="@base">%<xsl:value-of select="@base"/>%\</xsl:if><xsl:value-of select="@value"/>
</xsl:template>

<xsl:template match="classpath">
:classpath
Rem Set the classpath.
SET CLASSPATH=<xsl:apply-templates select="element"/><xsl:apply-templates select="external"/>

</xsl:template>

<xsl:template match="element">;%CJDBC_HOME%\<xsl:value-of select="@path"/></xsl:template>
<xsl:template match="external">;%<xsl:value-of select="@base"/>%\<xsl:value-of select="@path"/></xsl:template>

<xsl:template match="java">

Rem Change directory if needed
<xsl:if test="@dir">cd %<xsl:value-of select="@dir"/>%</xsl:if>

Rem Java Command.
%JAVA% %JVM_OPTIONS% <xsl:apply-templates select="option"/> -classpath %CLASSPATH% <xsl:value-of select="@class"/><xsl:text> </xsl:text> <xsl:apply-templates select="arg"/> %1 %2 %3 %4 %5 %6 %7 %8 %9
</xsl:template>

<xsl:template match="arg"><xsl:value-of select="@name"/><xsl:if test="@name"><xsl:if test="@value or @base">=</xsl:if></xsl:if><xsl:if test="@base">%<xsl:value-of select="@base"/>%<xsl:if test="@value">/</xsl:if></xsl:if><xsl:value-of select="@value"/><xsl:text> </xsl:text></xsl:template>

<xsl:template match="option"><xsl:text> </xsl:text>
<xsl:if test="@name"><xsl:value-of select="@name"/>=</xsl:if>
<xsl:if test="@base">%<xsl:value-of select="@base"/>%</xsl:if>
<xsl:value-of select="@value"/>
<xsl:text> </xsl:text>
</xsl:template>

</xsl:stylesheet>

