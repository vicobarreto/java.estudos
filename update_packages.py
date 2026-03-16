import os
import re

def process_file(filepath, pkg_name):
    with open(filepath, 'r', encoding='utf-8') as f:
        content = f.read()

    # if there is already a package declaration, replace it
    if re.search(r'^\s*package\s+[^;]+;', content, flags=re.MULTILINE):
        content = re.sub(r'^\s*package\s+[^;]+;', f'package {pkg_name};', content, flags=re.MULTILINE)
    else:
        # prepend package declaration
        content = f'package {pkg_name};\n\n' + content

    with open(filepath, 'w', encoding='utf-8') as f:
        f.write(content)

base_dir = r"c:\Users\Vicob\IdeaProjects\Helloide\src"

# aulas
aulas_dir = os.path.join(base_dir, 'aulas')
for f in os.listdir(aulas_dir):
    if f.endswith('.java'):
        process_file(os.path.join(aulas_dir, f), 'aulas')

# exercicios
exercicios_dir = os.path.join(base_dir, 'exercicios')
for d in os.listdir(exercicios_dir):
    ex_d = os.path.join(exercicios_dir, d)
    if os.path.isdir(ex_d):
        pkg_name = f'exercicios.{d}'
        for f in os.listdir(ex_d):
            if f.endswith('.java'):
                process_file(os.path.join(ex_d, f), pkg_name)

print("Package declarations updated successfully.")
