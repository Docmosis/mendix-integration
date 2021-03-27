// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package docmosiscloud.proxies.constants;

import com.mendix.core.Core;

public class Constants
{
	// These are the constants for the DocmosisCloud module

	/**
	* Your Docmosis Cloud API access key.
	*/
	public static java.lang.String getAPIAccessKey()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("DocmosisCloud.APIAccessKey");
	}

	/**
	* End-point in the USA https://us.dws3.docmosis.com/api
	* End-point in the EU   https://eu.dws3.docmosis.com/api
	* End-point in AUS       https://au.dws3.docmosis.com/api
	*/
	public static java.lang.String getAPIEndpoint()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("DocmosisCloud.APIEndpoint");
	}

	/**
	* The default timeout on all Docmosis Cloud API calls.
	*/
	public static java.lang.Long getAPITimeOutSeconds()
	{
		return (java.lang.Long)Core.getConfiguration().getConstantValue("DocmosisCloud.APITimeOutSeconds");
	}
}