// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package docmosiscloud.proxies;

public class RenderResponse extends docmosiscloud.proxies.Response
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "DocmosisCloud.RenderResponse";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Base64File("Base64File"),
		OutputName("OutputName"),
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

	public RenderResponse(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "DocmosisCloud.RenderResponse"));
	}

	protected RenderResponse(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject renderResponseMendixObject)
	{
		super(context, renderResponseMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("DocmosisCloud.RenderResponse", renderResponseMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a DocmosisCloud.RenderResponse");
	}

	/**
	 * @deprecated Use 'RenderResponse.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static docmosiscloud.proxies.RenderResponse initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return docmosiscloud.proxies.RenderResponse.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static docmosiscloud.proxies.RenderResponse initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new docmosiscloud.proxies.RenderResponse(context, mendixObject);
	}

	public static docmosiscloud.proxies.RenderResponse load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return docmosiscloud.proxies.RenderResponse.initialize(context, mendixObject);
	}

	/**
	 * @return value of Base64File
	 */
	public final java.lang.String getBase64File()
	{
		return getBase64File(getContext());
	}

	/**
	 * @param context
	 * @return value of Base64File
	 */
	public final java.lang.String getBase64File(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Base64File.toString());
	}

	/**
	 * Set value of Base64File
	 * @param base64file
	 */
	public final void setBase64File(java.lang.String base64file)
	{
		setBase64File(getContext(), base64file);
	}

	/**
	 * Set value of Base64File
	 * @param context
	 * @param base64file
	 */
	public final void setBase64File(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String base64file)
	{
		getMendixObject().setValue(context, MemberNames.Base64File.toString(), base64file);
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

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final docmosiscloud.proxies.RenderResponse that = (docmosiscloud.proxies.RenderResponse) obj;
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
		return "DocmosisCloud.RenderResponse";
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
