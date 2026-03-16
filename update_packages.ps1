$base_dir = "c:\Users\Vicob\IdeaProjects\Helloide\src"

# aulas
Get-ChildItem -Path "$base_dir\aulas" -Filter *.java | ForEach-Object {
    $content = Get-Content -Path $_.FullName -Raw
    if ($content -notmatch '(?m)^\s*package\s+.*;') {
        $newContent = "package aulas;`r`n`r`n" + $content
        Set-Content -Path $_.FullName -Value $newContent -NoNewline
    } else {
        $newContent = $content -replace '(?m)^\s*package\s+.*;', "package aulas;"
        Set-Content -Path $_.FullName -Value $newContent -NoNewline
    }
}

# exercicios
Get-ChildItem -Path "$base_dir\exercicios" -Directory | ForEach-Object {
    $ex_d = $_.FullName
    $pkg_name = "exercicios." + $_.Name
    Get-ChildItem -Path $ex_d -Filter *.java | ForEach-Object {
        $content = Get-Content -Path $_.FullName -Raw
        if ($content -notmatch '(?m)^\s*package\s+.*;') {
            $newContent = "package ${pkg_name};`r`n`r`n" + $content
            Set-Content -Path $_.FullName -Value $newContent -NoNewline
        } else {
            $newContent = $content -replace '(?m)^\s*package\s+.*;', "package ${pkg_name};"
            Set-Content -Path $_.FullName -Value $newContent -NoNewline
        }
    }
}
