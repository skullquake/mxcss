package system;

import com.mendix.core.actionmanagement.IActionRegistrator;

public class UserActionsRegistrar
{
  public void registerActions(IActionRegistrator registrator)
  {
    registrator.bundleComponentLoaded();
    registrator.registerUserAction(mxcss.actions.DeepClone.class);
    registrator.registerUserAction(mxcss.actions.FileDocumentFromFile.class);
    registrator.registerUserAction(mxcss.actions.RegexReplaceAll.class);
    registrator.registerUserAction(mxcss.actions.StringFromFile.class);
    registrator.registerUserAction(mxcss.actions.UnzipDocument.class);
    registrator.registerUserAction(mxcss.actions.ZipDocuments.class);
    registrator.registerUserAction(system.actions.VerifyPassword.class);
  }
}
