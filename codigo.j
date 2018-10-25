.source prog_destino.java
.class public prog_destino
.super java/lang/Object
.method public <init>()V
.limit stack 1
.limit locals 1
aload_0
invokespecial java/lang/Object/<init>()V
return
.end method

.method public static main([Ljava/lang/String;)V
.limit stack 100
.limit locals 100
ldc2_w 0.0
dstore 1 

ldc2_w 5.0
dstore 3 

LabelInicio-0: 

dload 3
ldc2_w 5.0
dcmpg
ifeq LABEL_00
dconst_0 
goto LABEL_01
LABEL_00:
dconst_1 
LABEL_01:
dconst_0
dcmpg
ifeq LabelFalse-1
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 1
invokevirtual java/io/PrintStream/println(D)V

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc " "
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

dload 1
ldc2_w 1.0
dadd
dstore 1 

dload 1
ldc2_w 10.0
dcmpg
ifeq LABEL_02
dconst_0 
goto LABEL_03
LABEL_02:
dconst_1 
LABEL_03:
dconst_0
dcmpg
ifeq LabelFalse-2
ldc2_w 0.0
dstore 3 

dload 1
ldc2_w 10.0
dcmpg
ifeq LABEL_04
dconst_0 
goto LABEL_05
LABEL_04:
dconst_1 
LABEL_05:
dconst_0
dcmpg
ifeq LabelFalse-3
ldc2_w 0.0
dstore 3 


LabelFalse-3: 


LabelFalse-2: 

LabelInicio-4: 

ldc2_w 5.0
dconst_0
dcmpg
ifeq LabelFalse-5
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc2_w 5.0
invokevirtual java/io/PrintStream/println(D)V


goto LabelInicio-4

LabelFalse-5: 


goto LabelInicio-0

LabelFalse-1: 

return
.end method
