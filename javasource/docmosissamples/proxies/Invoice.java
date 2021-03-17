// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package docmosissamples.proxies;

public class Invoice
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject invoiceMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "DocmosisSamples.Invoice";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Number("Number"),
		Date("Date"),
		PONumber("PONumber"),
		PaymentDays("PaymentDays"),
		Invoice_Customer("DocmosisSamples.Invoice_Customer");

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

	public Invoice(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "DocmosisSamples.Invoice"));
	}

	protected Invoice(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject invoiceMendixObject)
	{
		if (invoiceMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("DocmosisSamples.Invoice", invoiceMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a DocmosisSamples.Invoice");

		this.invoiceMendixObject = invoiceMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Invoice.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static docmosissamples.proxies.Invoice initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return docmosissamples.proxies.Invoice.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static docmosissamples.proxies.Invoice initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new docmosissamples.proxies.Invoice(context, mendixObject);
	}

	public static docmosissamples.proxies.Invoice load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return docmosissamples.proxies.Invoice.initialize(context, mendixObject);
	}

	public static java.util.List<docmosissamples.proxies.Invoice> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<docmosissamples.proxies.Invoice> result = new java.util.ArrayList<docmosissamples.proxies.Invoice>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//DocmosisSamples.Invoice" + xpathConstraint))
			result.add(docmosissamples.proxies.Invoice.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
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
	 * @return value of Number
	 */
	public final java.lang.String getNumber()
	{
		return getNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of Number
	 */
	public final java.lang.String getNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Number.toString());
	}

	/**
	 * Set value of Number
	 * @param number
	 */
	public final void setNumber(java.lang.String number)
	{
		setNumber(getContext(), number);
	}

	/**
	 * Set value of Number
	 * @param context
	 * @param number
	 */
	public final void setNumber(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String number)
	{
		getMendixObject().setValue(context, MemberNames.Number.toString(), number);
	}

	/**
	 * @return value of Date
	 */
	public final java.util.Date getDate()
	{
		return getDate(getContext());
	}

	/**
	 * @param context
	 * @return value of Date
	 */
	public final java.util.Date getDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.Date.toString());
	}

	/**
	 * Set value of Date
	 * @param date
	 */
	public final void setDate(java.util.Date date)
	{
		setDate(getContext(), date);
	}

	/**
	 * Set value of Date
	 * @param context
	 * @param date
	 */
	public final void setDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date date)
	{
		getMendixObject().setValue(context, MemberNames.Date.toString(), date);
	}

	/**
	 * @return value of PONumber
	 */
	public final java.lang.String getPONumber()
	{
		return getPONumber(getContext());
	}

	/**
	 * @param context
	 * @return value of PONumber
	 */
	public final java.lang.String getPONumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.PONumber.toString());
	}

	/**
	 * Set value of PONumber
	 * @param ponumber
	 */
	public final void setPONumber(java.lang.String ponumber)
	{
		setPONumber(getContext(), ponumber);
	}

	/**
	 * Set value of PONumber
	 * @param context
	 * @param ponumber
	 */
	public final void setPONumber(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String ponumber)
	{
		getMendixObject().setValue(context, MemberNames.PONumber.toString(), ponumber);
	}

	/**
	 * @return value of PaymentDays
	 */
	public final java.lang.Integer getPaymentDays()
	{
		return getPaymentDays(getContext());
	}

	/**
	 * @param context
	 * @return value of PaymentDays
	 */
	public final java.lang.Integer getPaymentDays(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.PaymentDays.toString());
	}

	/**
	 * Set value of PaymentDays
	 * @param paymentdays
	 */
	public final void setPaymentDays(java.lang.Integer paymentdays)
	{
		setPaymentDays(getContext(), paymentdays);
	}

	/**
	 * Set value of PaymentDays
	 * @param context
	 * @param paymentdays
	 */
	public final void setPaymentDays(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer paymentdays)
	{
		getMendixObject().setValue(context, MemberNames.PaymentDays.toString(), paymentdays);
	}

	/**
	 * @return value of Invoice_Customer
	 */
	public final docmosissamples.proxies.Customer getInvoice_Customer() throws com.mendix.core.CoreException
	{
		return getInvoice_Customer(getContext());
	}

	/**
	 * @param context
	 * @return value of Invoice_Customer
	 */
	public final docmosissamples.proxies.Customer getInvoice_Customer(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		docmosissamples.proxies.Customer result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Invoice_Customer.toString());
		if (identifier != null)
			result = docmosissamples.proxies.Customer.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Invoice_Customer
	 * @param invoice_customer
	 */
	public final void setInvoice_Customer(docmosissamples.proxies.Customer invoice_customer)
	{
		setInvoice_Customer(getContext(), invoice_customer);
	}

	/**
	 * Set value of Invoice_Customer
	 * @param context
	 * @param invoice_customer
	 */
	public final void setInvoice_Customer(com.mendix.systemwideinterfaces.core.IContext context, docmosissamples.proxies.Customer invoice_customer)
	{
		if (invoice_customer == null)
			getMendixObject().setValue(context, MemberNames.Invoice_Customer.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Invoice_Customer.toString(), invoice_customer.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return invoiceMendixObject;
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
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final docmosissamples.proxies.Invoice that = (docmosissamples.proxies.Invoice) obj;
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
		return "DocmosisSamples.Invoice";
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