// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package docmosiscloud.proxies;

public class GetSampleDataResponse extends docmosiscloud.proxies.Response
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "DocmosisCloud.GetSampleDataResponse";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		TemplateSampleData("TemplateSampleData"),
		Format("Format"),
		Result("Result"),
		ShortMessage("ShortMessage"),
		LongMessage("LongMessage"),
		RequestID("RequestID"),
		Response_Exception("DocmosisCloud.Response_Exception"),
		Response_Http("DocmosisCloud.Response_Http");

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

	public GetSampleDataResponse(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "DocmosisCloud.GetSampleDataResponse"));
	}

	protected GetSampleDataResponse(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject getSampleDataResponseMendixObject)
	{
		super(context, getSampleDataResponseMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("DocmosisCloud.GetSampleDataResponse", getSampleDataResponseMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a DocmosisCloud.GetSampleDataResponse");
	}

	/**
	 * @deprecated Use 'GetSampleDataResponse.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static docmosiscloud.proxies.GetSampleDataResponse initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return docmosiscloud.proxies.GetSampleDataResponse.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static docmosiscloud.proxies.GetSampleDataResponse initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new docmosiscloud.proxies.GetSampleDataResponse(context, mendixObject);
	}

	public static docmosiscloud.proxies.GetSampleDataResponse load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return docmosiscloud.proxies.GetSampleDataResponse.initialize(context, mendixObject);
	}

	/**
	 * @return value of TemplateSampleData
	 */
	public final java.lang.String getTemplateSampleData()
	{
		return getTemplateSampleData(getContext());
	}

	/**
	 * @param context
	 * @return value of TemplateSampleData
	 */
	public final java.lang.String getTemplateSampleData(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.TemplateSampleData.toString());
	}

	/**
	 * Set value of TemplateSampleData
	 * @param templatesampledata
	 */
	public final void setTemplateSampleData(java.lang.String templatesampledata)
	{
		setTemplateSampleData(getContext(), templatesampledata);
	}

	/**
	 * Set value of TemplateSampleData
	 * @param context
	 * @param templatesampledata
	 */
	public final void setTemplateSampleData(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String templatesampledata)
	{
		getMendixObject().setValue(context, MemberNames.TemplateSampleData.toString(), templatesampledata);
	}

	/**
	 * Set value of Format
	 * @param format
	 */
	public final docmosiscloud.proxies.Enum_GetSampleData_Format getFormat()
	{
		return getFormat(getContext());
	}

	/**
	 * @param context
	 * @return value of Format
	 */
	public final docmosiscloud.proxies.Enum_GetSampleData_Format getFormat(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Format.toString());
		if (obj == null)
			return null;

		return docmosiscloud.proxies.Enum_GetSampleData_Format.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Format
	 * @param format
	 */
	public final void setFormat(docmosiscloud.proxies.Enum_GetSampleData_Format format)
	{
		setFormat(getContext(), format);
	}

	/**
	 * Set value of Format
	 * @param context
	 * @param format
	 */
	public final void setFormat(com.mendix.systemwideinterfaces.core.IContext context, docmosiscloud.proxies.Enum_GetSampleData_Format format)
	{
		if (format != null)
			getMendixObject().setValue(context, MemberNames.Format.toString(), format.toString());
		else
			getMendixObject().setValue(context, MemberNames.Format.toString(), null);
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final docmosiscloud.proxies.GetSampleDataResponse that = (docmosiscloud.proxies.GetSampleDataResponse) obj;
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
		return "DocmosisCloud.GetSampleDataResponse";
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
