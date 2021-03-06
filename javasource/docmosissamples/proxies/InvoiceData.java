// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package docmosissamples.proxies;

public class InvoiceData
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject invoiceDataMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "DocmosisSamples.InvoiceData";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Number("Number"),
		Date("Date"),
		PONumber("PONumber"),
		PaymentDays("PaymentDays"),
		CustomerName("CustomerName"),
		CustomerContact("CustomerContact"),
		CustomerAddress1("CustomerAddress1"),
		CustomerAddress2("CustomerAddress2"),
		CustomerCity("CustomerCity"),
		CustomerState("CustomerState"),
		CustomerZipCode("CustomerZipCode");

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

	public InvoiceData(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "DocmosisSamples.InvoiceData"));
	}

	protected InvoiceData(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject invoiceDataMendixObject)
	{
		if (invoiceDataMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("DocmosisSamples.InvoiceData", invoiceDataMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a DocmosisSamples.InvoiceData");

		this.invoiceDataMendixObject = invoiceDataMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'InvoiceData.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static docmosissamples.proxies.InvoiceData initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return docmosissamples.proxies.InvoiceData.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static docmosissamples.proxies.InvoiceData initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new docmosissamples.proxies.InvoiceData(context, mendixObject);
	}

	public static docmosissamples.proxies.InvoiceData load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return docmosissamples.proxies.InvoiceData.initialize(context, mendixObject);
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
	public final java.lang.String getDate()
	{
		return getDate(getContext());
	}

	/**
	 * @param context
	 * @return value of Date
	 */
	public final java.lang.String getDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Date.toString());
	}

	/**
	 * Set value of Date
	 * @param date
	 */
	public final void setDate(java.lang.String date)
	{
		setDate(getContext(), date);
	}

	/**
	 * Set value of Date
	 * @param context
	 * @param date
	 */
	public final void setDate(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String date)
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
	 * @return value of CustomerName
	 */
	public final java.lang.String getCustomerName()
	{
		return getCustomerName(getContext());
	}

	/**
	 * @param context
	 * @return value of CustomerName
	 */
	public final java.lang.String getCustomerName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CustomerName.toString());
	}

	/**
	 * Set value of CustomerName
	 * @param customername
	 */
	public final void setCustomerName(java.lang.String customername)
	{
		setCustomerName(getContext(), customername);
	}

	/**
	 * Set value of CustomerName
	 * @param context
	 * @param customername
	 */
	public final void setCustomerName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String customername)
	{
		getMendixObject().setValue(context, MemberNames.CustomerName.toString(), customername);
	}

	/**
	 * @return value of CustomerContact
	 */
	public final java.lang.String getCustomerContact()
	{
		return getCustomerContact(getContext());
	}

	/**
	 * @param context
	 * @return value of CustomerContact
	 */
	public final java.lang.String getCustomerContact(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CustomerContact.toString());
	}

	/**
	 * Set value of CustomerContact
	 * @param customercontact
	 */
	public final void setCustomerContact(java.lang.String customercontact)
	{
		setCustomerContact(getContext(), customercontact);
	}

	/**
	 * Set value of CustomerContact
	 * @param context
	 * @param customercontact
	 */
	public final void setCustomerContact(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String customercontact)
	{
		getMendixObject().setValue(context, MemberNames.CustomerContact.toString(), customercontact);
	}

	/**
	 * @return value of CustomerAddress1
	 */
	public final java.lang.String getCustomerAddress1()
	{
		return getCustomerAddress1(getContext());
	}

	/**
	 * @param context
	 * @return value of CustomerAddress1
	 */
	public final java.lang.String getCustomerAddress1(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CustomerAddress1.toString());
	}

	/**
	 * Set value of CustomerAddress1
	 * @param customeraddress1
	 */
	public final void setCustomerAddress1(java.lang.String customeraddress1)
	{
		setCustomerAddress1(getContext(), customeraddress1);
	}

	/**
	 * Set value of CustomerAddress1
	 * @param context
	 * @param customeraddress1
	 */
	public final void setCustomerAddress1(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String customeraddress1)
	{
		getMendixObject().setValue(context, MemberNames.CustomerAddress1.toString(), customeraddress1);
	}

	/**
	 * @return value of CustomerAddress2
	 */
	public final java.lang.String getCustomerAddress2()
	{
		return getCustomerAddress2(getContext());
	}

	/**
	 * @param context
	 * @return value of CustomerAddress2
	 */
	public final java.lang.String getCustomerAddress2(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CustomerAddress2.toString());
	}

	/**
	 * Set value of CustomerAddress2
	 * @param customeraddress2
	 */
	public final void setCustomerAddress2(java.lang.String customeraddress2)
	{
		setCustomerAddress2(getContext(), customeraddress2);
	}

	/**
	 * Set value of CustomerAddress2
	 * @param context
	 * @param customeraddress2
	 */
	public final void setCustomerAddress2(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String customeraddress2)
	{
		getMendixObject().setValue(context, MemberNames.CustomerAddress2.toString(), customeraddress2);
	}

	/**
	 * @return value of CustomerCity
	 */
	public final java.lang.String getCustomerCity()
	{
		return getCustomerCity(getContext());
	}

	/**
	 * @param context
	 * @return value of CustomerCity
	 */
	public final java.lang.String getCustomerCity(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CustomerCity.toString());
	}

	/**
	 * Set value of CustomerCity
	 * @param customercity
	 */
	public final void setCustomerCity(java.lang.String customercity)
	{
		setCustomerCity(getContext(), customercity);
	}

	/**
	 * Set value of CustomerCity
	 * @param context
	 * @param customercity
	 */
	public final void setCustomerCity(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String customercity)
	{
		getMendixObject().setValue(context, MemberNames.CustomerCity.toString(), customercity);
	}

	/**
	 * @return value of CustomerState
	 */
	public final java.lang.String getCustomerState()
	{
		return getCustomerState(getContext());
	}

	/**
	 * @param context
	 * @return value of CustomerState
	 */
	public final java.lang.String getCustomerState(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CustomerState.toString());
	}

	/**
	 * Set value of CustomerState
	 * @param customerstate
	 */
	public final void setCustomerState(java.lang.String customerstate)
	{
		setCustomerState(getContext(), customerstate);
	}

	/**
	 * Set value of CustomerState
	 * @param context
	 * @param customerstate
	 */
	public final void setCustomerState(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String customerstate)
	{
		getMendixObject().setValue(context, MemberNames.CustomerState.toString(), customerstate);
	}

	/**
	 * @return value of CustomerZipCode
	 */
	public final java.lang.String getCustomerZipCode()
	{
		return getCustomerZipCode(getContext());
	}

	/**
	 * @param context
	 * @return value of CustomerZipCode
	 */
	public final java.lang.String getCustomerZipCode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CustomerZipCode.toString());
	}

	/**
	 * Set value of CustomerZipCode
	 * @param customerzipcode
	 */
	public final void setCustomerZipCode(java.lang.String customerzipcode)
	{
		setCustomerZipCode(getContext(), customerzipcode);
	}

	/**
	 * Set value of CustomerZipCode
	 * @param context
	 * @param customerzipcode
	 */
	public final void setCustomerZipCode(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String customerzipcode)
	{
		getMendixObject().setValue(context, MemberNames.CustomerZipCode.toString(), customerzipcode);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return invoiceDataMendixObject;
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
			final docmosissamples.proxies.InvoiceData that = (docmosissamples.proxies.InvoiceData) obj;
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
		return "DocmosisSamples.InvoiceData";
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
