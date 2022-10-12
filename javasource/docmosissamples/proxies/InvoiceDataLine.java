// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package docmosissamples.proxies;

public class InvoiceDataLine
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject invoiceDataLineMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "DocmosisSamples.InvoiceDataLine";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Product("Product"),
		Description("Description"),
		Quantity("Quantity"),
		PriceQuantity("PriceQuantity"),
		InvoiceDataLine_InvoiceData("DocmosisSamples.InvoiceDataLine_InvoiceData");

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

	public InvoiceDataLine(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected InvoiceDataLine(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject invoiceDataLineMendixObject)
	{
		if (invoiceDataLineMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, invoiceDataLineMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.invoiceDataLineMendixObject = invoiceDataLineMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'InvoiceDataLine.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static docmosissamples.proxies.InvoiceDataLine initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return docmosissamples.proxies.InvoiceDataLine.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static docmosissamples.proxies.InvoiceDataLine initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new docmosissamples.proxies.InvoiceDataLine(context, mendixObject);
	}

	public static docmosissamples.proxies.InvoiceDataLine load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return docmosissamples.proxies.InvoiceDataLine.initialize(context, mendixObject);
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
	 * @return value of Product
	 */
	public final java.lang.String getProduct()
	{
		return getProduct(getContext());
	}

	/**
	 * @param context
	 * @return value of Product
	 */
	public final java.lang.String getProduct(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Product.toString());
	}

	/**
	 * Set value of Product
	 * @param product
	 */
	public final void setProduct(java.lang.String product)
	{
		setProduct(getContext(), product);
	}

	/**
	 * Set value of Product
	 * @param context
	 * @param product
	 */
	public final void setProduct(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String product)
	{
		getMendixObject().setValue(context, MemberNames.Product.toString(), product);
	}

	/**
	 * @return value of Description
	 */
	public final java.lang.String getDescription()
	{
		return getDescription(getContext());
	}

	/**
	 * @param context
	 * @return value of Description
	 */
	public final java.lang.String getDescription(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Description.toString());
	}

	/**
	 * Set value of Description
	 * @param description
	 */
	public final void setDescription(java.lang.String description)
	{
		setDescription(getContext(), description);
	}

	/**
	 * Set value of Description
	 * @param context
	 * @param description
	 */
	public final void setDescription(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String description)
	{
		getMendixObject().setValue(context, MemberNames.Description.toString(), description);
	}

	/**
	 * @return value of Quantity
	 */
	public final java.lang.Integer getQuantity()
	{
		return getQuantity(getContext());
	}

	/**
	 * @param context
	 * @return value of Quantity
	 */
	public final java.lang.Integer getQuantity(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Quantity.toString());
	}

	/**
	 * Set value of Quantity
	 * @param quantity
	 */
	public final void setQuantity(java.lang.Integer quantity)
	{
		setQuantity(getContext(), quantity);
	}

	/**
	 * Set value of Quantity
	 * @param context
	 * @param quantity
	 */
	public final void setQuantity(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer quantity)
	{
		getMendixObject().setValue(context, MemberNames.Quantity.toString(), quantity);
	}

	/**
	 * @return value of PriceQuantity
	 */
	public final java.math.BigDecimal getPriceQuantity()
	{
		return getPriceQuantity(getContext());
	}

	/**
	 * @param context
	 * @return value of PriceQuantity
	 */
	public final java.math.BigDecimal getPriceQuantity(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.PriceQuantity.toString());
	}

	/**
	 * Set value of PriceQuantity
	 * @param pricequantity
	 */
	public final void setPriceQuantity(java.math.BigDecimal pricequantity)
	{
		setPriceQuantity(getContext(), pricequantity);
	}

	/**
	 * Set value of PriceQuantity
	 * @param context
	 * @param pricequantity
	 */
	public final void setPriceQuantity(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal pricequantity)
	{
		getMendixObject().setValue(context, MemberNames.PriceQuantity.toString(), pricequantity);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of InvoiceDataLine_InvoiceData
	 */
	public final docmosissamples.proxies.InvoiceData getInvoiceDataLine_InvoiceData() throws com.mendix.core.CoreException
	{
		return getInvoiceDataLine_InvoiceData(getContext());
	}

	/**
	 * @param context
	 * @return value of InvoiceDataLine_InvoiceData
	 * @throws com.mendix.core.CoreException
	 */
	public final docmosissamples.proxies.InvoiceData getInvoiceDataLine_InvoiceData(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		docmosissamples.proxies.InvoiceData result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.InvoiceDataLine_InvoiceData.toString());
		if (identifier != null) {
			result = docmosissamples.proxies.InvoiceData.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of InvoiceDataLine_InvoiceData
	 * @param invoicedataline_invoicedata
	 */
	public final void setInvoiceDataLine_InvoiceData(docmosissamples.proxies.InvoiceData invoicedataline_invoicedata)
	{
		setInvoiceDataLine_InvoiceData(getContext(), invoicedataline_invoicedata);
	}

	/**
	 * Set value of InvoiceDataLine_InvoiceData
	 * @param context
	 * @param invoicedataline_invoicedata
	 */
	public final void setInvoiceDataLine_InvoiceData(com.mendix.systemwideinterfaces.core.IContext context, docmosissamples.proxies.InvoiceData invoicedataline_invoicedata)
	{
		if (invoicedataline_invoicedata == null) {
			getMendixObject().setValue(context, MemberNames.InvoiceDataLine_InvoiceData.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.InvoiceDataLine_InvoiceData.toString(), invoicedataline_invoicedata.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return invoiceDataLineMendixObject;
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
			final docmosissamples.proxies.InvoiceDataLine that = (docmosissamples.proxies.InvoiceDataLine) obj;
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
