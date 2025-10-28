package com.simple.plugin;

import com.intellij.codeInspection.*;
import com.intellij.psi.*;
import org.jetbrains.annotations.NotNull;

public class SimpleComplexityChecker extends AbstractBaseJavaLocalInspectionTool {

    @NotNull
    @Override
    public PsiElementVisitor buildVisitor(@NotNull ProblemsHolder holder, boolean isOnTheFly) {
        return new JavaElementVisitor() {
            @Override
            public void visitForStatement(PsiForStatement statement) {
                checkForNestedLoops(statement, holder);
            }
        };
    }

    private void checkForNestedLoops(PsiForStatement outerLoop, ProblemsHolder holder) {
        PsiStatement body = outerLoop.getBody();
        if (body != null) {
            body.accept(new JavaRecursiveElementWalkingVisitor() {
                @Override
                public void visitForStatement(PsiForStatement innerLoop) {
                    holder.registerProblem(
                            outerLoop.getFirstChild(),
                            "Algorithm complexity O(n^2) or higher",
                            ProblemHighlightType.WARNING
                    );
                }
            });
        }
    }
}