// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package docmosiscloudunittesting.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;

public class Microflows
{
	/**
	 * @deprecated
	 * The default constructor of the Microflows class should not be used.
	 * Use the static microflow invocation methods instead.
	 */
	@java.lang.Deprecated(since = "9.12", forRemoval = true)
	public Microflows() {}

	// These are the microflows for the DocmosisCloudUnitTesting module
	public static void test_Convert_SuccessToEnumeration(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("DocmosisCloudUnitTesting.Test_Convert_SuccessToEnumeration").withParams(params).execute(context);
	}
	public static void test_Misc_GenerateUUID(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("DocmosisCloudUnitTesting.Test_Misc_GenerateUUID").withParams(params).execute(context);
	}
	public static void test_Misc_RequestURL_Create(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("DocmosisCloudUnitTesting.Test_Misc_RequestURL_Create").withParams(params).execute(context);
	}
	public static void test_Misc_RequestURL_Sanitize(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("DocmosisCloudUnitTesting.Test_Misc_RequestURL_Sanitize").withParams(params).execute(context);
	}
	public static void test_Render_GenerateJSON(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("DocmosisCloudUnitTesting.Test_Render_GenerateJSON").withParams(params).execute(context);
	}
	public static void test_Request_UpdateAPI(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("DocmosisCloudUnitTesting.Test_Request_UpdateAPI").withParams(params).execute(context);
	}
	public static void test_Rule_Response_IsSuccess(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("DocmosisCloudUnitTesting.Test_Rule_Response_IsSuccess").withParams(params).execute(context);
	}
	public static void test_UrlEncodedRequest(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("DocmosisCloudUnitTesting.Test_UrlEncodedRequest").withParams(params).execute(context);
	}
}
