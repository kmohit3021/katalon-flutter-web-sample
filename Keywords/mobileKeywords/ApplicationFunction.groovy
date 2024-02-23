package mobileKeywords

import com.kms.katalon.core.annotation.Keyword

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;

public class ApplicationFunction {

	@Keyword
	public boolean isInstalled(Context context, String packageName) {
		PackageManager pkgManager = context.getPackageManager();
		Intent launchIntent = new Intent(Intent.ACTION_MAIN);
		launchIntent.addCategory(Intent.CATEGORY_LAUNCHER);
		List<ResolveInfo> resInfo = pkgManager.queryIntentActivities(launchIntent, 0);

		for (int i = 0; i < resInfo.size(); i++) {
			ResolveInfo ri = resInfo.get(i);
			String pkgName = ri.activityInfo.packageName;;
			if (pkgName.contains(packageName)) {
				return true;
			}
		}
		return false;
	}
}
