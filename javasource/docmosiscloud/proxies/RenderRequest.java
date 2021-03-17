// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package docmosiscloud.proxies;

public class RenderRequest extends docmosiscloud.proxies.Request
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "DocmosisCloud.RenderRequest";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		TemplateName("TemplateName"),
		OutputName("OutputName"),
		OutputFormat("OutputFormat"),
		StoreTo("StoreTo"),
		CompressSingleFormat("CompressSingleFormat"),
		DevMode("DevMode"),
		data("data"),
		MailSubject("MailSubject"),
		MailBodyHtml("MailBodyHtml"),
		MailBodyText("MailBodyText"),
		MailNoZipAttachments("MailNoZipAttachments"),
		SourceId("SourceId"),
		StylesInText("StylesInText"),
		PasswordProtect("PasswordProtect"),
		PdfArchiveMode("PdfArchiveMode"),
		PdfWatermark("PdfWatermark"),
		PdfTagged("PdfTagged"),
		IgnoreUnknownParams("IgnoreUnknownParams"),
		Tags("Tags"),
		StreamResultInResponse("StreamResultInResponse"),
		APIAccessKey("APIAccessKey"),
		APIEndPoint("APIEndPoint"),
		RequestID("RequestID");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public RenderRequest(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "DocmosisCloud.RenderRequest"));
	}

	protected RenderRequest(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject renderRequestMendixObject)
	{
		super(context, renderRequestMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("DocmosisCloud.RenderRequest", renderRequestMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a DocmosisCloud.RenderRequest");
	}

	/**
	 * @deprecated Use 'RenderRequest.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static docmosiscloud.proxies.RenderRequest initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return docmosiscloud.proxies.RenderRequest.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static docmosiscloud.proxies.RenderRequest initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		if (com.mendix.core.Core.isSubClassOf("DocmosisCloudUnitTesting.EmployeeRender", mendixObject.getType()))
			return docmosiscloudunittesting.proxies.EmployeeRender.initialize(context, mendixObject);

		return new docmosiscloud.proxies.RenderRequest(context, mendixObject);
	}

	public static docmosiscloud.proxies.RenderRequest load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return docmosiscloud.proxies.RenderRequest.initialize(context, mendixObject);
	}

	/**
	 * @return value of TemplateName
	 */
	public final java.lang.String getTemplateName()
	{
		return getTemplateName(getContext());
	}

	/**
	 * @param context
	 * @return value of TemplateName
	 */
	public final java.lang.String getTemplateName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.TemplateName.toString());
	}

	/**
	 * Set value of TemplateName
	 * @param templatename
	 */
	public final void setTemplateName(java.lang.String templatename)
	{
		setTemplateName(getContext(), templatename);
	}

	/**
	 * Set value of TemplateName
	 * @param context
	 * @param templatename
	 */
	public final void setTemplateName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String templatename)
	{
		getMendixObject().setValue(context, MemberNames.TemplateName.toString(), templatename);
	}

	/**
	 * @return value of OutputName
	 */
	public final java.lang.String getOutputName()
	{
		return getOutputName(getContext());
	}

	/**
	 * @param context
	 * @return value of OutputName
	 */
	public final java.lang.String getOutputName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.OutputName.toString());
	}

	/**
	 * Set value of OutputName
	 * @param outputname
	 */
	public final void setOutputName(java.lang.String outputname)
	{
		setOutputName(getContext(), outputname);
	}

	/**
	 * Set value of OutputName
	 * @param context
	 * @param outputname
	 */
	public final void setOutputName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String outputname)
	{
		getMendixObject().setValue(context, MemberNames.OutputName.toString(), outputname);
	}

	/**
	 * @return value of OutputFormat
	 */
	public final java.lang.String getOutputFormat()
	{
		return getOutputFormat(getContext());
	}

	/**
	 * @param context
	 * @return value of OutputFormat
	 */
	public final java.lang.String getOutputFormat(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.OutputFormat.toString());
	}

	/**
	 * Set value of OutputFormat
	 * @param outputformat
	 */
	public final void setOutputFormat(java.lang.String outputformat)
	{
		setOutputFormat(getContext(), outputformat);
	}

	/**
	 * Set value of OutputFormat
	 * @param context
	 * @param outputformat
	 */
	public final void setOutputFormat(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String outputformat)
	{
		getMendixObject().setValue(context, MemberNames.OutputFormat.toString(), outputformat);
	}

	/**
	 * @return value of StoreTo
	 */
	public final java.lang.String getStoreTo()
	{
		return getStoreTo(getContext());
	}

	/**
	 * @param context
	 * @return value of StoreTo
	 */
	public final java.lang.String getStoreTo(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.StoreTo.toString());
	}

	/**
	 * Set value of StoreTo
	 * @param storeto
	 */
	public final void setStoreTo(java.lang.String storeto)
	{
		setStoreTo(getContext(), storeto);
	}

	/**
	 * Set value of StoreTo
	 * @param context
	 * @param storeto
	 */
	public final void setStoreTo(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String storeto)
	{
		getMendixObject().setValue(context, MemberNames.StoreTo.toString(), storeto);
	}

	/**
	 * @return value of CompressSingleFormat
	 */
	public final java.lang.Boolean getCompressSingleFormat()
	{
		return getCompressSingleFormat(getContext());
	}

	/**
	 * @param context
	 * @return value of CompressSingleFormat
	 */
	public final java.lang.Boolean getCompressSingleFormat(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.CompressSingleFormat.toString());
	}

	/**
	 * Set value of CompressSingleFormat
	 * @param compresssingleformat
	 */
	public final void setCompressSingleFormat(java.lang.Boolean compresssingleformat)
	{
		setCompressSingleFormat(getContext(), compresssingleformat);
	}

	/**
	 * Set value of CompressSingleFormat
	 * @param context
	 * @param compresssingleformat
	 */
	public final void setCompressSingleFormat(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean compresssingleformat)
	{
		getMendixObject().setValue(context, MemberNames.CompressSingleFormat.toString(), compresssingleformat);
	}

	/**
	 * @return value of DevMode
	 */
	public final java.lang.Boolean getDevMode()
	{
		return getDevMode(getContext());
	}

	/**
	 * @param context
	 * @return value of DevMode
	 */
	public final java.lang.Boolean getDevMode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.DevMode.toString());
	}

	/**
	 * Set value of DevMode
	 * @param devmode
	 */
	public final void setDevMode(java.lang.Boolean devmode)
	{
		setDevMode(getContext(), devmode);
	}

	/**
	 * Set value of DevMode
	 * @param context
	 * @param devmode
	 */
	public final void setDevMode(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean devmode)
	{
		getMendixObject().setValue(context, MemberNames.DevMode.toString(), devmode);
	}

	/**
	 * @return value of data
	 */
	public final java.lang.String getdata()
	{
		return getdata(getContext());
	}

	/**
	 * @param context
	 * @return value of data
	 */
	public final java.lang.String getdata(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.data.toString());
	}

	/**
	 * Set value of data
	 * @param data
	 */
	public final void setdata(java.lang.String data)
	{
		setdata(getContext(), data);
	}

	/**
	 * Set value of data
	 * @param context
	 * @param data
	 */
	public final void setdata(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String data)
	{
		getMendixObject().setValue(context, MemberNames.data.toString(), data);
	}

	/**
	 * @return value of MailSubject
	 */
	public final java.lang.String getMailSubject()
	{
		return getMailSubject(getContext());
	}

	/**
	 * @param context
	 * @return value of MailSubject
	 */
	public final java.lang.String getMailSubject(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.MailSubject.toString());
	}

	/**
	 * Set value of MailSubject
	 * @param mailsubject
	 */
	public final void setMailSubject(java.lang.String mailsubject)
	{
		setMailSubject(getContext(), mailsubject);
	}

	/**
	 * Set value of MailSubject
	 * @param context
	 * @param mailsubject
	 */
	public final void setMailSubject(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String mailsubject)
	{
		getMendixObject().setValue(context, MemberNames.MailSubject.toString(), mailsubject);
	}

	/**
	 * @return value of MailBodyHtml
	 */
	public final java.lang.String getMailBodyHtml()
	{
		return getMailBodyHtml(getContext());
	}

	/**
	 * @param context
	 * @return value of MailBodyHtml
	 */
	public final java.lang.String getMailBodyHtml(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.MailBodyHtml.toString());
	}

	/**
	 * Set value of MailBodyHtml
	 * @param mailbodyhtml
	 */
	public final void setMailBodyHtml(java.lang.String mailbodyhtml)
	{
		setMailBodyHtml(getContext(), mailbodyhtml);
	}

	/**
	 * Set value of MailBodyHtml
	 * @param context
	 * @param mailbodyhtml
	 */
	public final void setMailBodyHtml(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String mailbodyhtml)
	{
		getMendixObject().setValue(context, MemberNames.MailBodyHtml.toString(), mailbodyhtml);
	}

	/**
	 * @return value of MailBodyText
	 */
	public final java.lang.String getMailBodyText()
	{
		return getMailBodyText(getContext());
	}

	/**
	 * @param context
	 * @return value of MailBodyText
	 */
	public final java.lang.String getMailBodyText(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.MailBodyText.toString());
	}

	/**
	 * Set value of MailBodyText
	 * @param mailbodytext
	 */
	public final void setMailBodyText(java.lang.String mailbodytext)
	{
		setMailBodyText(getContext(), mailbodytext);
	}

	/**
	 * Set value of MailBodyText
	 * @param context
	 * @param mailbodytext
	 */
	public final void setMailBodyText(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String mailbodytext)
	{
		getMendixObject().setValue(context, MemberNames.MailBodyText.toString(), mailbodytext);
	}

	/**
	 * @return value of MailNoZipAttachments
	 */
	public final java.lang.Boolean getMailNoZipAttachments()
	{
		return getMailNoZipAttachments(getContext());
	}

	/**
	 * @param context
	 * @return value of MailNoZipAttachments
	 */
	public final java.lang.Boolean getMailNoZipAttachments(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.MailNoZipAttachments.toString());
	}

	/**
	 * Set value of MailNoZipAttachments
	 * @param mailnozipattachments
	 */
	public final void setMailNoZipAttachments(java.lang.Boolean mailnozipattachments)
	{
		setMailNoZipAttachments(getContext(), mailnozipattachments);
	}

	/**
	 * Set value of MailNoZipAttachments
	 * @param context
	 * @param mailnozipattachments
	 */
	public final void setMailNoZipAttachments(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean mailnozipattachments)
	{
		getMendixObject().setValue(context, MemberNames.MailNoZipAttachments.toString(), mailnozipattachments);
	}

	/**
	 * @return value of SourceId
	 */
	public final java.lang.String getSourceId()
	{
		return getSourceId(getContext());
	}

	/**
	 * @param context
	 * @return value of SourceId
	 */
	public final java.lang.String getSourceId(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.SourceId.toString());
	}

	/**
	 * Set value of SourceId
	 * @param sourceid
	 */
	public final void setSourceId(java.lang.String sourceid)
	{
		setSourceId(getContext(), sourceid);
	}

	/**
	 * Set value of SourceId
	 * @param context
	 * @param sourceid
	 */
	public final void setSourceId(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String sourceid)
	{
		getMendixObject().setValue(context, MemberNames.SourceId.toString(), sourceid);
	}

	/**
	 * @return value of StylesInText
	 */
	public final java.lang.Boolean getStylesInText()
	{
		return getStylesInText(getContext());
	}

	/**
	 * @param context
	 * @return value of StylesInText
	 */
	public final java.lang.Boolean getStylesInText(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.StylesInText.toString());
	}

	/**
	 * Set value of StylesInText
	 * @param stylesintext
	 */
	public final void setStylesInText(java.lang.Boolean stylesintext)
	{
		setStylesInText(getContext(), stylesintext);
	}

	/**
	 * Set value of StylesInText
	 * @param context
	 * @param stylesintext
	 */
	public final void setStylesInText(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean stylesintext)
	{
		getMendixObject().setValue(context, MemberNames.StylesInText.toString(), stylesintext);
	}

	/**
	 * @return value of PasswordProtect
	 */
	public final java.lang.String getPasswordProtect()
	{
		return getPasswordProtect(getContext());
	}

	/**
	 * @param context
	 * @return value of PasswordProtect
	 */
	public final java.lang.String getPasswordProtect(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.PasswordProtect.toString());
	}

	/**
	 * Set value of PasswordProtect
	 * @param passwordprotect
	 */
	public final void setPasswordProtect(java.lang.String passwordprotect)
	{
		setPasswordProtect(getContext(), passwordprotect);
	}

	/**
	 * Set value of PasswordProtect
	 * @param context
	 * @param passwordprotect
	 */
	public final void setPasswordProtect(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String passwordprotect)
	{
		getMendixObject().setValue(context, MemberNames.PasswordProtect.toString(), passwordprotect);
	}

	/**
	 * @return value of PdfArchiveMode
	 */
	public final java.lang.Boolean getPdfArchiveMode()
	{
		return getPdfArchiveMode(getContext());
	}

	/**
	 * @param context
	 * @return value of PdfArchiveMode
	 */
	public final java.lang.Boolean getPdfArchiveMode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.PdfArchiveMode.toString());
	}

	/**
	 * Set value of PdfArchiveMode
	 * @param pdfarchivemode
	 */
	public final void setPdfArchiveMode(java.lang.Boolean pdfarchivemode)
	{
		setPdfArchiveMode(getContext(), pdfarchivemode);
	}

	/**
	 * Set value of PdfArchiveMode
	 * @param context
	 * @param pdfarchivemode
	 */
	public final void setPdfArchiveMode(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean pdfarchivemode)
	{
		getMendixObject().setValue(context, MemberNames.PdfArchiveMode.toString(), pdfarchivemode);
	}

	/**
	 * @return value of PdfWatermark
	 */
	public final java.lang.String getPdfWatermark()
	{
		return getPdfWatermark(getContext());
	}

	/**
	 * @param context
	 * @return value of PdfWatermark
	 */
	public final java.lang.String getPdfWatermark(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.PdfWatermark.toString());
	}

	/**
	 * Set value of PdfWatermark
	 * @param pdfwatermark
	 */
	public final void setPdfWatermark(java.lang.String pdfwatermark)
	{
		setPdfWatermark(getContext(), pdfwatermark);
	}

	/**
	 * Set value of PdfWatermark
	 * @param context
	 * @param pdfwatermark
	 */
	public final void setPdfWatermark(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String pdfwatermark)
	{
		getMendixObject().setValue(context, MemberNames.PdfWatermark.toString(), pdfwatermark);
	}

	/**
	 * @return value of PdfTagged
	 */
	public final java.lang.Boolean getPdfTagged()
	{
		return getPdfTagged(getContext());
	}

	/**
	 * @param context
	 * @return value of PdfTagged
	 */
	public final java.lang.Boolean getPdfTagged(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.PdfTagged.toString());
	}

	/**
	 * Set value of PdfTagged
	 * @param pdftagged
	 */
	public final void setPdfTagged(java.lang.Boolean pdftagged)
	{
		setPdfTagged(getContext(), pdftagged);
	}

	/**
	 * Set value of PdfTagged
	 * @param context
	 * @param pdftagged
	 */
	public final void setPdfTagged(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean pdftagged)
	{
		getMendixObject().setValue(context, MemberNames.PdfTagged.toString(), pdftagged);
	}

	/**
	 * @return value of IgnoreUnknownParams
	 */
	public final java.lang.Boolean getIgnoreUnknownParams()
	{
		return getIgnoreUnknownParams(getContext());
	}

	/**
	 * @param context
	 * @return value of IgnoreUnknownParams
	 */
	public final java.lang.Boolean getIgnoreUnknownParams(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IgnoreUnknownParams.toString());
	}

	/**
	 * Set value of IgnoreUnknownParams
	 * @param ignoreunknownparams
	 */
	public final void setIgnoreUnknownParams(java.lang.Boolean ignoreunknownparams)
	{
		setIgnoreUnknownParams(getContext(), ignoreunknownparams);
	}

	/**
	 * Set value of IgnoreUnknownParams
	 * @param context
	 * @param ignoreunknownparams
	 */
	public final void setIgnoreUnknownParams(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean ignoreunknownparams)
	{
		getMendixObject().setValue(context, MemberNames.IgnoreUnknownParams.toString(), ignoreunknownparams);
	}

	/**
	 * @return value of Tags
	 */
	public final java.lang.String getTags()
	{
		return getTags(getContext());
	}

	/**
	 * @param context
	 * @return value of Tags
	 */
	public final java.lang.String getTags(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Tags.toString());
	}

	/**
	 * Set value of Tags
	 * @param tags
	 */
	public final void setTags(java.lang.String tags)
	{
		setTags(getContext(), tags);
	}

	/**
	 * Set value of Tags
	 * @param context
	 * @param tags
	 */
	public final void setTags(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String tags)
	{
		getMendixObject().setValue(context, MemberNames.Tags.toString(), tags);
	}

	/**
	 * @return value of StreamResultInResponse
	 */
	public final java.lang.Boolean getStreamResultInResponse()
	{
		return getStreamResultInResponse(getContext());
	}

	/**
	 * @param context
	 * @return value of StreamResultInResponse
	 */
	public final java.lang.Boolean getStreamResultInResponse(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.StreamResultInResponse.toString());
	}

	/**
	 * Set value of StreamResultInResponse
	 * @param streamresultinresponse
	 */
	public final void setStreamResultInResponse(java.lang.Boolean streamresultinresponse)
	{
		setStreamResultInResponse(getContext(), streamresultinresponse);
	}

	/**
	 * Set value of StreamResultInResponse
	 * @param context
	 * @param streamresultinresponse
	 */
	public final void setStreamResultInResponse(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean streamresultinresponse)
	{
		getMendixObject().setValue(context, MemberNames.StreamResultInResponse.toString(), streamresultinresponse);
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final docmosiscloud.proxies.RenderRequest that = (docmosiscloud.proxies.RenderRequest) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "DocmosisCloud.RenderRequest";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Override
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
