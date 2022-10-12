// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package docmosiscloudimplementation.proxies;

public class TemplateJSONStructure
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject templateJSONStructureMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "DocmosisCloudImplementation.TemplateJSONStructure";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		TemplateName("TemplateName"),
		JSON("JSON");

		private final java.lang.String metaName;

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

	public TemplateJSONStructure(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected TemplateJSONStructure(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject templateJSONStructureMendixObject)
	{
		if (templateJSONStructureMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, templateJSONStructureMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.templateJSONStructureMendixObject = templateJSONStructureMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'TemplateJSONStructure.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static docmosiscloudimplementation.proxies.TemplateJSONStructure initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return docmosiscloudimplementation.proxies.TemplateJSONStructure.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static docmosiscloudimplementation.proxies.TemplateJSONStructure initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new docmosiscloudimplementation.proxies.TemplateJSONStructure(context, mendixObject);
	}

	public static docmosiscloudimplementation.proxies.TemplateJSONStructure load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return docmosiscloudimplementation.proxies.TemplateJSONStructure.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
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
	 * @return value of JSON
	 */
	public final java.lang.String getJSON()
	{
		return getJSON(getContext());
	}

	/**
	 * @param context
	 * @return value of JSON
	 */
	public final java.lang.String getJSON(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.JSON.toString());
	}

	/**
	 * Set value of JSON
	 * @param json
	 */
	public final void setJSON(java.lang.String json)
	{
		setJSON(getContext(), json);
	}

	/**
	 * Set value of JSON
	 * @param context
	 * @param json
	 */
	public final void setJSON(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String json)
	{
		getMendixObject().setValue(context, MemberNames.JSON.toString(), json);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return templateJSONStructureMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final docmosiscloudimplementation.proxies.TemplateJSONStructure that = (docmosiscloudimplementation.proxies.TemplateJSONStructure) obj;
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
		return entityName;
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
