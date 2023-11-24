<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
   
<xsl:output method="text" indent="no"/>

<xsl:template match="/">#!/bin/sh

# CJDBC_HOME definition
CJDBC_HOME=%INSTALL_PATH

# JAVA setup.
#
# We try to use first the java JVM in JAVA_HOME and if not found,
# we use the one found in the path.
# You can specify additional options to give to the Java JVM in the
# JAVA_OPTS environment variable.
if [ -z "$JAVA_HOME" ]
then
    JAVA=`which java`
    if [ ! -x "$JAVA" ]; then
      echo "Cannot find java command. Please set the JAVA_HOME environment variable."
      exit 1
    fi
else
    JAVA=$JAVA_HOME/bin/java
fi
export JAVA
  <xsl:apply-templates select="script/definition"/>
# uncomment to debug
# JVM_OPTIONS="$JVM_OPTIONS -enableassertions -Xdebug -Xnoagent -Djava.compiler=none -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=$CJDBC_DEFAULT_JVMDEBUG_PORT"
  <xsl:apply-templates select="script/classpath"/>
  <xsl:apply-templates select="script/java"/>
</xsl:template>

<xsl:template match="definition">
  <xsl:value-of select="@name"/>=<xsl:if test="@base">$<xsl:value-of select="@base"/>/</xsl:if><xsl:value-of select="@value"/>
  <xsl:text>
  </xsl:text>
</xsl:template>

<xsl:template match="classpath">
# Set the classpath.
unset CLASSPATH
CLASSPATH=<xsl:apply-templates select="element"/><xsl:apply-templates select="external"/>
</xsl:template>

<xsl:template match="element">:$CJDBC_HOME/<xsl:value-of select="@path"/></xsl:template>
<xsl:template match="external">:$<xsl:value-of select="@base"/>/<xsl:value-of select="@path"/></xsl:template>

<xsl:template match="java">

# Change directory if needed
<xsl:if test="@dir">cd $<xsl:value-of select="@dir"/></xsl:if>

# Java Command.
$JAVA $JVM_OPTIONS -classpath $CLASSPATH <xsl:apply-templates select="option"/> <xsl:value-of select="@class"/><xsl:text> </xsl:text> <xsl:apply-templates select="arg"/> "$@"
</xsl:template>

<xsl:template match="arg"><xsl:value-of select="@name"/><xsl:if test="@name"><xsl:if test="@value or @base">=</xsl:if></xsl:if><xsl:if test="@base">$<xsl:value-of select="@base"/><xsl:if test="@value">/</xsl:if></xsl:if><xsl:value-of select="@value"/><xsl:text> </xsl:text></xsl:template>

<xsl:template match="option"><xsl:text> </xsl:text>
<xsl:if test="@name"><xsl:value-of select="@name"/>=</xsl:if>
<xsl:if test="@base">$<xsl:value-of select="@base"/></xsl:if>
<xsl:value-of select="@value"/>
<xsl:text> </xsl:text>
</xsl:template>

</xsl:stylesheet>
