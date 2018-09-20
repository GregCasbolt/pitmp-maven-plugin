package eu.stamp_project.plugins;

import java.util.function.Predicate;

import org.apache.maven.project.MavenProject;

import eu.stamp_project.PmpContext;

// **********************************************************************
public class PmpNonEmptyProjectCheck implements Predicate<MavenProject>
{

    // **********************************************************************
    @SuppressWarnings("unchecked")
    @Override
    public boolean test(MavenProject project)
    {
        PmpProject theProject = PmpContext.getInstance().getCurrentProject();
        // assert(theProject != null)

        return theProject.hasTestCompileSourceRoots().booleanValue();
    }
}
