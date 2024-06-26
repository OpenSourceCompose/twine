/*
 * Copyright 2024 Sasikanth Miriyampalli
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dev.sasikanth.rss.reader.components

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import dev.sasikanth.rss.reader.ui.AppTheme

@Composable
fun Button(
  onClick: () -> Unit,
  modifier: Modifier = Modifier,
  enabled: Boolean = true,
  colors: ButtonColors =
    ButtonDefaults.buttonColors(
      containerColor = AppTheme.colorScheme.tintedForeground,
      contentColor = AppTheme.colorScheme.tintedBackground,
      disabledContainerColor = AppTheme.colorScheme.onSurface.copy(alpha = 0.12f),
      disabledContentColor = AppTheme.colorScheme.onSurface.copy(alpha = 0.38f)
    ),
  content: @Composable RowScope.() -> Unit
) {
  androidx.compose.material3.Button(
    modifier = modifier,
    onClick = onClick,
    colors = colors,
    shape = MaterialTheme.shapes.medium,
    content = content,
    enabled = enabled
  )
}
