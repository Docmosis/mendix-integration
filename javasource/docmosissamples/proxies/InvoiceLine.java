// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package docmosissamples.proxies;

public class InvoiceLine
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject invoiceLineMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "DocmosisSamples.InvoiceLine";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Quantity("Quantity"),
		PriceQuantity("PriceQuantity"),
		InvoiceLine_Invoice("DocmosisSamples.InvoiceLine_Invoice"),
		InvoiceLine_Product("DocmosisSamples.InvoiceLine_Product");

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

	public InvoiceLine(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected InvoiceLine(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject invoiceLineMendixObject)
	{
		if (invoiceLineMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, invoiceLineMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.invoiceLineMendixObject = invoiceLineMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'InvoiceLine.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static docmosissamples.proxies.InvoiceLine initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return docmosissamples.proxies.InvoiceLine.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static docmosissamples.proxies.InvoiceLine initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new docmosissamples.proxies.InvoiceLine(context, mendixObject);
	}

	public static docmosissamples.proxies.InvoiceLine load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return docmosissamples.proxies.InvoiceLine.initialize(context, mendixObject);
	}

	public static java.util.List<docmosissamples.proxies.InvoiceLine> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> docmosissamples.proxies.InvoiceLine.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
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
	 * @return value of InvoiceLine_Invoice
	 */
	public final docmosissamples.proxies.Invoice getInvoiceLine_Invoice() throws com.mendix.core.CoreException
	{
		return getInvoiceLine_Invoice(getContext());
	}

	/**
	 * @param context
	 * @return value of InvoiceLine_Invoice
	 * @throws com.mendix.core.CoreException
	 */
	public final docmosissamples.proxies.Invoice getInvoiceLine_Invoice(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		docmosissamples.proxies.Invoice result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.InvoiceLine_Invoice.toString());
		if (identifier != null) {
			result = docmosissamples.proxies.Invoice.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of InvoiceLine_Invoice
	 * @param invoiceline_invoice
	 */
	public final void setInvoiceLine_Invoice(docmosissamples.proxies.Invoice invoiceline_invoice)
	{
		setInvoiceLine_Invoice(getContext(), invoiceline_invoice);
	}

	/**
	 * Set value of InvoiceLine_Invoice
	 * @param context
	 * @param invoiceline_invoice
	 */
	public final void setInvoiceLine_Invoice(com.mendix.systemwideinterfaces.core.IContext context, docmosissamples.proxies.Invoice invoiceline_invoice)
	{
		if (invoiceline_invoice == null) {
			getMendixObject().setValue(context, MemberNames.InvoiceLine_Invoice.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.InvoiceLine_Invoice.toString(), invoiceline_invoice.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of InvoiceLine_Product
	 */
	public final docmosissamples.proxies.Product getInvoiceLine_Product() throws com.mendix.core.CoreException
	{
		return getInvoiceLine_Product(getContext());
	}

	/**
	 * @param context
	 * @return value of InvoiceLine_Product
	 * @throws com.mendix.core.CoreException
	 */
	public final docmosissamples.proxies.Product getInvoiceLine_Product(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		docmosissamples.proxies.Product result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.InvoiceLine_Product.toString());
		if (identifier != null) {
			result = docmosissamples.proxies.Product.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of InvoiceLine_Product
	 * @param invoiceline_product
	 */
	public final void setInvoiceLine_Product(docmosissamples.proxies.Product invoiceline_product)
	{
		setInvoiceLine_Product(getContext(), invoiceline_product);
	}

	/**
	 * Set value of InvoiceLine_Product
	 * @param context
	 * @param invoiceline_product
	 */
	public final void setInvoiceLine_Product(com.mendix.systemwideinterfaces.core.IContext context, docmosissamples.proxies.Product invoiceline_product)
	{
		if (invoiceline_product == null) {
			getMendixObject().setValue(context, MemberNames.InvoiceLine_Product.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.InvoiceLine_Product.toString(), invoiceline_product.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return invoiceLineMendixObject;
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
			final docmosissamples.proxies.InvoiceLine that = (docmosissamples.proxies.InvoiceLine) obj;
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
