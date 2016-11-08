// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package communitycommons.actions;

import com.mendix.systemwideinterfaces.core.IMendixObject;
import communitycommons.Misc;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

/**
 * Returns the filesize of a file document in bytes.
 * 
 * From version 2.3 on, this function can be used in cloud environments as well. 
 * 
 * NOTE:
 * before 2.1, this functioned returned the size in kilobytes, although this documentation mentioned bytes
 */
public class getFileSize extends CustomJavaAction<Long>
{
	private IMendixObject __document;
	private system.proxies.FileDocument document;

	public getFileSize(IContext context, IMendixObject document)
	{
		super(context);
		this.__document = document;
	}

	@Override
	public Long executeAction() throws Exception
	{
		this.document = __document == null ? null : system.proxies.FileDocument.initialize(getContext(), __document);

		// BEGIN USER CODE
		return Misc.getFileSize(this.getContext(), document.getMendixObject());
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "getFileSize";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
