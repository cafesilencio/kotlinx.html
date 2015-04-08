package html4k

import html4k.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

public fun <T, C : TagConsumer<T>> C.a(href : String? = null, target : String? = null, block : A.() -> Unit) : T = build(listOf("href" to href,"target" to target).toAttributesMap(), ::buildA, block).finalize()

public fun <T, C : TagConsumer<T>> C.abbr(block : ABBR.() -> Unit) : T = build(emptyMap(), ::buildABBR, block).finalize()

public fun <T, C : TagConsumer<T>> C.address(block : ADDRESS.() -> Unit) : T = build(emptyMap(), ::buildADDRESS, block).finalize()

public fun <T, C : TagConsumer<T>> C.area(alt : String? = null, content : String = "") : T = build(listOf("alt" to alt).toAttributesMap(), ::buildAREA, {+content}).finalize()
public fun <T, C : TagConsumer<T>> C.area(alt : String? = null, block : AREA.() -> Unit) : T = build(listOf("alt" to alt).toAttributesMap(), ::buildAREA, block).finalize()

public fun <T, C : TagConsumer<T>> C.article(block : ARTICLE.() -> Unit) : T = build(emptyMap(), ::buildARTICLE, block).finalize()

public fun <T, C : TagConsumer<T>> C.aside(block : ASIDE.() -> Unit) : T = build(emptyMap(), ::buildASIDE, block).finalize()

public fun <T, C : TagConsumer<T>> C.audio(block : AUDIO.() -> Unit) : T = build(emptyMap(), ::buildAUDIO, block).finalize()

public fun <T, C : TagConsumer<T>> C.b(block : B.() -> Unit) : T = build(emptyMap(), ::buildB, block).finalize()

public fun <T, C : TagConsumer<T>> C.base(content : String = "") : T = build(emptyMap(), ::buildBASE, {+content}).finalize()
public fun <T, C : TagConsumer<T>> C.base(block : BASE.() -> Unit) : T = build(emptyMap(), ::buildBASE, block).finalize()

public fun <T, C : TagConsumer<T>> C.bdi(block : BDI.() -> Unit) : T = build(emptyMap(), ::buildBDI, block).finalize()

public fun <T, C : TagConsumer<T>> C.bdo(block : BDO.() -> Unit) : T = build(emptyMap(), ::buildBDO, block).finalize()

public fun <T, C : TagConsumer<T>> C.blockQuote(block : BLOCKQUOTE.() -> Unit) : T = build(emptyMap(), ::buildBLOCKQUOTE, block).finalize()

public fun <T, C : TagConsumer<T>> C.body(block : BODY.() -> Unit) : T = build(emptyMap(), ::buildBODY, block).finalize()

public fun <T, C : TagConsumer<T>> C.br(content : String = "") : T = build(emptyMap(), ::buildBR, {+content}).finalize()
public fun <T, C : TagConsumer<T>> C.br(block : BR.() -> Unit) : T = build(emptyMap(), ::buildBR, block).finalize()

public fun <T, C : TagConsumer<T>> C.button(block : BUTTON.() -> Unit) : T = build(emptyMap(), ::buildBUTTON, block).finalize()

public fun <T, C : TagConsumer<T>> C.canvas(content : String = "") : T = build(emptyMap(), ::buildCANVAS, {+content}).finalize()
public fun <T, C : TagConsumer<T>> C.canvas(block : CANVAS.() -> Unit) : T = build(emptyMap(), ::buildCANVAS, block).finalize()

public fun <T, C : TagConsumer<T>> C.caption(block : CAPTION.() -> Unit) : T = build(emptyMap(), ::buildCAPTION, block).finalize()

public fun <T, C : TagConsumer<T>> C.cite(block : CITE.() -> Unit) : T = build(emptyMap(), ::buildCITE, block).finalize()

public fun <T, C : TagConsumer<T>> C.code(block : CODE.() -> Unit) : T = build(emptyMap(), ::buildCODE, block).finalize()

public fun <T, C : TagConsumer<T>> C.col(content : String = "") : T = build(emptyMap(), ::buildCOL, {+content}).finalize()
public fun <T, C : TagConsumer<T>> C.col(block : COL.() -> Unit) : T = build(emptyMap(), ::buildCOL, block).finalize()

public fun <T, C : TagConsumer<T>> C.colGroup(block : COLGROUP.() -> Unit) : T = build(emptyMap(), ::buildCOLGROUP, block).finalize()

public fun <T, C : TagConsumer<T>> C.command(content : String = "") : T = build(emptyMap(), ::buildCOMMAND, {+content}).finalize()
public fun <T, C : TagConsumer<T>> C.command(block : COMMAND.() -> Unit) : T = build(emptyMap(), ::buildCOMMAND, block).finalize()

public fun <T, C : TagConsumer<T>> C.dataList(block : DATALIST.() -> Unit) : T = build(emptyMap(), ::buildDATALIST, block).finalize()

public fun <T, C : TagConsumer<T>> C.dd(block : DD.() -> Unit) : T = build(emptyMap(), ::buildDD, block).finalize()

public fun <T, C : TagConsumer<T>> C.del(block : DEL.() -> Unit) : T = build(emptyMap(), ::buildDEL, block).finalize()

public fun <T, C : TagConsumer<T>> C.details(block : DETAILS.() -> Unit) : T = build(emptyMap(), ::buildDETAILS, block).finalize()

public fun <T, C : TagConsumer<T>> C.dfn(block : DFN.() -> Unit) : T = build(emptyMap(), ::buildDFN, block).finalize()

public fun <T, C : TagConsumer<T>> C.dialog(block : DIALOG.() -> Unit) : T = build(emptyMap(), ::buildDIALOG, block).finalize()

public fun <T, C : TagConsumer<T>> C.div(classes : Set<String>? = null, block : DIV.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildDIV, block).finalize()

public fun <T, C : TagConsumer<T>> C.dl(block : DL.() -> Unit) : T = build(emptyMap(), ::buildDL, block).finalize()

public fun <T, C : TagConsumer<T>> C.dt(block : DT.() -> Unit) : T = build(emptyMap(), ::buildDT, block).finalize()

public fun <T, C : TagConsumer<T>> C.em(block : EM.() -> Unit) : T = build(emptyMap(), ::buildEM, block).finalize()

public fun <T, C : TagConsumer<T>> C.embed(content : String = "") : T = build(emptyMap(), ::buildEMBED, {+content}).finalize()
public fun <T, C : TagConsumer<T>> C.embed(block : EMBED.() -> Unit) : T = build(emptyMap(), ::buildEMBED, block).finalize()

public fun <T, C : TagConsumer<T>> C.fieldSet(block : FIELDSET.() -> Unit) : T = build(emptyMap(), ::buildFIELDSET, block).finalize()

public fun <T, C : TagConsumer<T>> C.figure(block : FIGURE.() -> Unit) : T = build(emptyMap(), ::buildFIGURE, block).finalize()

public fun <T, C : TagConsumer<T>> C.footer(block : FOOTER.() -> Unit) : T = build(emptyMap(), ::buildFOOTER, block).finalize()

public fun <T, C : TagConsumer<T>> C.form(action : String? = null, block : FORM.() -> Unit) : T = build(listOf("action" to action).toAttributesMap(), ::buildFORM, block).finalize()

public fun <T, C : TagConsumer<T>> C.h1(block : H1.() -> Unit) : T = build(emptyMap(), ::buildH1, block).finalize()

public fun <T, C : TagConsumer<T>> C.h2(block : H2.() -> Unit) : T = build(emptyMap(), ::buildH2, block).finalize()

public fun <T, C : TagConsumer<T>> C.h3(block : H3.() -> Unit) : T = build(emptyMap(), ::buildH3, block).finalize()

public fun <T, C : TagConsumer<T>> C.h4(block : H4.() -> Unit) : T = build(emptyMap(), ::buildH4, block).finalize()

public fun <T, C : TagConsumer<T>> C.h5(block : H5.() -> Unit) : T = build(emptyMap(), ::buildH5, block).finalize()

public fun <T, C : TagConsumer<T>> C.h6(block : H6.() -> Unit) : T = build(emptyMap(), ::buildH6, block).finalize()

public fun <T, C : TagConsumer<T>> C.head(block : HEAD.() -> Unit) : T = build(emptyMap(), ::buildHEAD, block).finalize()

public fun <T, C : TagConsumer<T>> C.header(block : HEADER.() -> Unit) : T = build(emptyMap(), ::buildHEADER, block).finalize()

public fun <T, C : TagConsumer<T>> C.hGroup(block : HGROUP.() -> Unit) : T = build(emptyMap(), ::buildHGROUP, block).finalize()

public fun <T, C : TagConsumer<T>> C.hr(content : String = "") : T = build(emptyMap(), ::buildHR, {+content}).finalize()
public fun <T, C : TagConsumer<T>> C.hr(block : HR.() -> Unit) : T = build(emptyMap(), ::buildHR, block).finalize()

public fun <T, C : TagConsumer<T>> C.html(block : HTML.() -> Unit) : T = build(emptyMap(), ::buildHTML, block).finalize()

public fun <T, C : TagConsumer<T>> C.i(block : I.() -> Unit) : T = build(emptyMap(), ::buildI, block).finalize()

public fun <T, C : TagConsumer<T>> C.iframe(content : String = "") : T = build(emptyMap(), ::buildIFRAME, {+content}).finalize()
public fun <T, C : TagConsumer<T>> C.iframe(block : IFRAME.() -> Unit) : T = build(emptyMap(), ::buildIFRAME, block).finalize()

public fun <T, C : TagConsumer<T>> C.img(alt : String? = null, src : String? = null, content : String = "") : T = build(listOf("alt" to alt,"src" to src).toAttributesMap(), ::buildIMG, {+content}).finalize()
public fun <T, C : TagConsumer<T>> C.img(alt : String? = null, src : String? = null, block : IMG.() -> Unit) : T = build(listOf("alt" to alt,"src" to src).toAttributesMap(), ::buildIMG, block).finalize()

public fun <T, C : TagConsumer<T>> C.input(type : InputType? = null, name : String? = null, content : String = "") : T = build(listOf("type" to type?.enumEncode(),"name" to name).toAttributesMap(), ::buildINPUT, {+content}).finalize()
public fun <T, C : TagConsumer<T>> C.input(type : InputType? = null, name : String? = null, block : INPUT.() -> Unit) : T = build(listOf("type" to type?.enumEncode(),"name" to name).toAttributesMap(), ::buildINPUT, block).finalize()

public fun <T, C : TagConsumer<T>> C.ins(block : INS.() -> Unit) : T = build(emptyMap(), ::buildINS, block).finalize()

public fun <T, C : TagConsumer<T>> C.kbd(block : KBD.() -> Unit) : T = build(emptyMap(), ::buildKBD, block).finalize()

public fun <T, C : TagConsumer<T>> C.keyGen(content : String = "") : T = build(emptyMap(), ::buildKEYGEN, {+content}).finalize()
public fun <T, C : TagConsumer<T>> C.keyGen(block : KEYGEN.() -> Unit) : T = build(emptyMap(), ::buildKEYGEN, block).finalize()

public fun <T, C : TagConsumer<T>> C.label(block : LABEL.() -> Unit) : T = build(emptyMap(), ::buildLABEL, block).finalize()

public fun <T, C : TagConsumer<T>> C.legEnd(block : LEGEND.() -> Unit) : T = build(emptyMap(), ::buildLEGEND, block).finalize()

public fun <T, C : TagConsumer<T>> C.li(block : LI.() -> Unit) : T = build(emptyMap(), ::buildLI, block).finalize()

public fun <T, C : TagConsumer<T>> C.link(content : String = "") : T = build(emptyMap(), ::buildLINK, {+content}).finalize()
public fun <T, C : TagConsumer<T>> C.link(block : LINK.() -> Unit) : T = build(emptyMap(), ::buildLINK, block).finalize()

public fun <T, C : TagConsumer<T>> C.map(name : String? = null, block : MAP.() -> Unit) : T = build(listOf("name" to name).toAttributesMap(), ::buildMAP, block).finalize()

public fun <T, C : TagConsumer<T>> C.mark(block : MARK.() -> Unit) : T = build(emptyMap(), ::buildMARK, block).finalize()

public fun <T, C : TagConsumer<T>> C.math(block : MATH.() -> Unit) : T = build(emptyMap(), ::buildMATH, block).finalize()

public fun <T, C : TagConsumer<T>> C.mathml(content : String = "") : T = build(emptyMap(), ::buildMATHML, {+content}).finalize()
public fun <T, C : TagConsumer<T>> C.mathml(block : MATHML.() -> Unit) : T = build(emptyMap(), ::buildMATHML, block).finalize()

public fun <T, C : TagConsumer<T>> C.menu(block : MENU.() -> Unit) : T = build(emptyMap(), ::buildMENU, block).finalize()

public fun <T, C : TagConsumer<T>> C.meta(content : String = "") : T = build(emptyMap(), ::buildMETA, {+content}).finalize()
public fun <T, C : TagConsumer<T>> C.meta(block : META.() -> Unit) : T = build(emptyMap(), ::buildMETA, block).finalize()

public fun <T, C : TagConsumer<T>> C.meter(block : METER.() -> Unit) : T = build(emptyMap(), ::buildMETER, block).finalize()

public fun <T, C : TagConsumer<T>> C.nav(block : NAV.() -> Unit) : T = build(emptyMap(), ::buildNAV, block).finalize()

public fun <T, C : TagConsumer<T>> C.noScript(block : NOSCRIPT.() -> Unit) : T = build(emptyMap(), ::buildNOSCRIPT, block).finalize()

public fun <T, C : TagConsumer<T>> C.object_(block : OBJECT_.() -> Unit) : T = build(emptyMap(), ::buildOBJECT_, block).finalize()

public fun <T, C : TagConsumer<T>> C.ol(block : OL.() -> Unit) : T = build(emptyMap(), ::buildOL, block).finalize()

public fun <T, C : TagConsumer<T>> C.optGroup(label : String? = null, block : OPTGROUP.() -> Unit) : T = build(listOf("label" to label).toAttributesMap(), ::buildOPTGROUP, block).finalize()

public fun <T, C : TagConsumer<T>> C.option(content : String = "") : T = build(emptyMap(), ::buildOPTION, {+content}).finalize()
public fun <T, C : TagConsumer<T>> C.option(block : OPTION.() -> Unit) : T = build(emptyMap(), ::buildOPTION, block).finalize()

public fun <T, C : TagConsumer<T>> C.output(block : OUTPUT.() -> Unit) : T = build(emptyMap(), ::buildOUTPUT, block).finalize()

public fun <T, C : TagConsumer<T>> C.p(block : P.() -> Unit) : T = build(emptyMap(), ::buildP, block).finalize()

public fun <T, C : TagConsumer<T>> C.param(name : String? = null, value : String? = null, content : String = "") : T = build(listOf("name" to name,"value" to value).toAttributesMap(), ::buildPARAM, {+content}).finalize()
public fun <T, C : TagConsumer<T>> C.param(name : String? = null, value : String? = null, block : PARAM.() -> Unit) : T = build(listOf("name" to name,"value" to value).toAttributesMap(), ::buildPARAM, block).finalize()

public fun <T, C : TagConsumer<T>> C.pre(block : PRE.() -> Unit) : T = build(emptyMap(), ::buildPRE, block).finalize()

public fun <T, C : TagConsumer<T>> C.progress(block : PROGRESS.() -> Unit) : T = build(emptyMap(), ::buildPROGRESS, block).finalize()

public fun <T, C : TagConsumer<T>> C.q(block : Q.() -> Unit) : T = build(emptyMap(), ::buildQ, block).finalize()

public fun <T, C : TagConsumer<T>> C.rp(block : RP.() -> Unit) : T = build(emptyMap(), ::buildRP, block).finalize()

public fun <T, C : TagConsumer<T>> C.rt(block : RT.() -> Unit) : T = build(emptyMap(), ::buildRT, block).finalize()

public fun <T, C : TagConsumer<T>> C.ruby(block : RUBY.() -> Unit) : T = build(emptyMap(), ::buildRUBY, block).finalize()

public fun <T, C : TagConsumer<T>> C.samp(block : SAMP.() -> Unit) : T = build(emptyMap(), ::buildSAMP, block).finalize()

public fun <T, C : TagConsumer<T>> C.script(type : ScriptType? = null, src : String? = null, content : String = "") : T = build(listOf("type" to type?.enumEncode(),"src" to src).toAttributesMap(), ::buildSCRIPT, {+content}).finalize()
public fun <T, C : TagConsumer<T>> C.script(type : ScriptType? = null, src : String? = null, block : SCRIPT.() -> Unit) : T = build(listOf("type" to type?.enumEncode(),"src" to src).toAttributesMap(), ::buildSCRIPT, block).finalize()

public fun <T, C : TagConsumer<T>> C.section(block : SECTION.() -> Unit) : T = build(emptyMap(), ::buildSECTION, block).finalize()

public fun <T, C : TagConsumer<T>> C.select(block : SELECT.() -> Unit) : T = build(emptyMap(), ::buildSELECT, block).finalize()

public fun <T, C : TagConsumer<T>> C.small(block : SMALL.() -> Unit) : T = build(emptyMap(), ::buildSMALL, block).finalize()

public fun <T, C : TagConsumer<T>> C.source(content : String = "") : T = build(emptyMap(), ::buildSOURCE, {+content}).finalize()
public fun <T, C : TagConsumer<T>> C.source(block : SOURCE.() -> Unit) : T = build(emptyMap(), ::buildSOURCE, block).finalize()

public fun <T, C : TagConsumer<T>> C.span(block : SPAN.() -> Unit) : T = build(emptyMap(), ::buildSPAN, block).finalize()

public fun <T, C : TagConsumer<T>> C.strong(block : STRONG.() -> Unit) : T = build(emptyMap(), ::buildSTRONG, block).finalize()

public fun <T, C : TagConsumer<T>> C.style(content : String = "") : T = build(emptyMap(), ::buildSTYLE, {+content}).finalize()
public fun <T, C : TagConsumer<T>> C.style(block : STYLE.() -> Unit) : T = build(emptyMap(), ::buildSTYLE, block).finalize()

public fun <T, C : TagConsumer<T>> C.sub(block : SUB.() -> Unit) : T = build(emptyMap(), ::buildSUB, block).finalize()

public fun <T, C : TagConsumer<T>> C.sup(block : SUP.() -> Unit) : T = build(emptyMap(), ::buildSUP, block).finalize()

public fun <T, C : TagConsumer<T>> C.svg(content : String = "") : T = build(emptyMap(), ::buildSVG, {+content}).finalize()
public fun <T, C : TagConsumer<T>> C.svg(block : SVG.() -> Unit) : T = build(emptyMap(), ::buildSVG, block).finalize()

public fun <T, C : TagConsumer<T>> C.table(block : TABLE.() -> Unit) : T = build(emptyMap(), ::buildTABLE, block).finalize()

public fun <T, C : TagConsumer<T>> C.tbody(block : TBODY.() -> Unit) : T = build(emptyMap(), ::buildTBODY, block).finalize()

public fun <T, C : TagConsumer<T>> C.td(block : TD.() -> Unit) : T = build(emptyMap(), ::buildTD, block).finalize()

public fun <T, C : TagConsumer<T>> C.textArea(rows : String? = null, cols : String? = null, content : String = "") : T = build(listOf("rows" to rows,"cols" to cols).toAttributesMap(), ::buildTEXTAREA, {+content}).finalize()
public fun <T, C : TagConsumer<T>> C.textArea(rows : String? = null, cols : String? = null, block : TEXTAREA.() -> Unit) : T = build(listOf("rows" to rows,"cols" to cols).toAttributesMap(), ::buildTEXTAREA, block).finalize()

public fun <T, C : TagConsumer<T>> C.tfoot(block : TFOOT.() -> Unit) : T = build(emptyMap(), ::buildTFOOT, block).finalize()

public fun <T, C : TagConsumer<T>> C.th(block : TH.() -> Unit) : T = build(emptyMap(), ::buildTH, block).finalize()

public fun <T, C : TagConsumer<T>> C.thead(block : THEAD.() -> Unit) : T = build(emptyMap(), ::buildTHEAD, block).finalize()

public fun <T, C : TagConsumer<T>> C.time(block : TIME.() -> Unit) : T = build(emptyMap(), ::buildTIME, block).finalize()

public fun <T, C : TagConsumer<T>> C.title(content : String = "") : T = build(emptyMap(), ::buildTITLE, {+content}).finalize()
public fun <T, C : TagConsumer<T>> C.title(block : TITLE.() -> Unit) : T = build(emptyMap(), ::buildTITLE, block).finalize()

public fun <T, C : TagConsumer<T>> C.tr(block : TR.() -> Unit) : T = build(emptyMap(), ::buildTR, block).finalize()

public fun <T, C : TagConsumer<T>> C.ul(block : UL.() -> Unit) : T = build(emptyMap(), ::buildUL, block).finalize()

public fun <T, C : TagConsumer<T>> C.var_(block : VAR_.() -> Unit) : T = build(emptyMap(), ::buildVAR_, block).finalize()

public fun <T, C : TagConsumer<T>> C.video(block : VIDEO.() -> Unit) : T = build(emptyMap(), ::buildVIDEO, block).finalize()

